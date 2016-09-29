package mil.navy.safecen.solr.support;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SolrSupportTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SolrSupportTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SolrSupportTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSolrSupport()
    {
        assertTrue( true );
    }
}
