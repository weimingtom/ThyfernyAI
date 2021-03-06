/*
 * <summary></summary>
 * <author>thyferny</author>
 * <email>thyferny@163.com</email>
 * <create-date>2014/11/20 13:54</create-date>
 *
 * <copyright file="PostTagCompiler.java" company="thyferny">
 * 
 * 
 * </copyright>
 */
package in.thyferny.nlp.corpus.dependency.CoNll;

import in.thyferny.nlp.utility.Predefine;

/**
 * 等效词编译器
 * @author thyferny
 */
public class PosTagCompiler
{
    /**
     * 编译，比如将词性为数词的转为##数##
     * @param tag 标签
     * @param name 原词
     * @return 编译后的等效词
     */
    public static String compile(String tag, String name)
    {
        if (tag.startsWith("m")) return Predefine.TAG_NUMBER;
        else if (tag.startsWith("nr")) return Predefine.TAG_PEOPLE;
        else if (tag.startsWith("ns")) return Predefine.TAG_PLACE;
        else if (tag.startsWith("nt")) return Predefine.TAG_GROUP;
        else if (tag.startsWith("t")) return Predefine.TAG_TIME;
        else if (tag.equals("x")) return Predefine.TAG_CLUSTER;
        else if (tag.equals("nx")) return Predefine.TAG_PROPER;
        else if (tag.equals("xx")) return Predefine.TAG_OTHER;

//        switch (tag)
//        {
//            case "m":
//            case "mq":
//                return Predefine.TAG_NUMBER;
//            case "nr":
//            case "nr1":
//            case "nr2":
//            case "nrf":
//            case "nrj":
//                return Predefine.TAG_PEOPLE;
//            case "ns":
//            case "nsf":
//                return Predefine.TAG_PLACE;
//            case "nt":
//                return Predefine.TAG_TIME;
//            case "x":
//                return Predefine.TAG_CLUSTER;
//            case "nx":
//                return Predefine.TAG_PROPER;
//        }

        return name;
    }
}
