package ug;

import aws.smithy.kotlin.runtime.time.ParseException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.C39412p;
import yb3.EnumC39413q;

/* JADX INFO: renamed from: ug.s */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC34930s {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f147047a = 0;

    static {
        EnumC39413q enumC39413q = EnumC39413q.IGNORE_CASE;
        new C39412p("(-)?(\\d+(.(\\d+))?)E(-?\\d+)", 0);
    }

    /* JADX INFO: renamed from: a */
    public static final C34917f m110166a(int i13, String str) {
        AbstractC22676k.m65750j(str, "str");
        AbstractC34924m.m110128J(i13, 1, str);
        char cCharAt = str.charAt(i13);
        if (cCharAt == ' ') {
            return new C34917f(i13 + 1, Character.valueOf(cCharAt));
        }
        throw new ParseException(str, "expected ` ` found `" + cCharAt + '`', i13);
    }
}
