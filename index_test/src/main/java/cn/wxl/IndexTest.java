package cn.wxl;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.search.similarities.ClassicSimilarity;
import org.apache.lucene.search.similarities.Similarity;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.File;

/**
 * Created by wangxl6 on 2018/5/24.
 */
public class IndexTest {
    public static void main(String[] args) throws Exception {


        String path = "";

        File file = new File(path);
        Directory dir = FSDirectory.open(file.toPath());

        Analyzer analyzer = new StandardAnalyzer();
        Similarity sim = new ClassicSimilarity();

        IndexWriterConfig config = new IndexWriterConfig();

        IndexWriter indexWriter = new IndexWriter(dir,config);



        indexWriter.commit();
        indexWriter.close();



    }
}
