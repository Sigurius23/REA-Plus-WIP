package com.getkeepsafe.relinker;

import ih0.AbstractC18489d0;
import java.util.Arrays;
import p319m4.AbstractC25012a;

/* JADX INFO: loaded from: classes6.dex */
public class MissingLibraryException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    public MissingLibraryException(String str, String[] strArr, String[] strArr2) {
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("Could not find '", str, "'. Looked for: ");
        sbM53375p.append(Arrays.toString(strArr));
        sbM53375p.append(", but only found: ");
        super(AbstractC25012a.m73376i(Arrays.toString(strArr2), ".", sbM53375p));
    }
}
