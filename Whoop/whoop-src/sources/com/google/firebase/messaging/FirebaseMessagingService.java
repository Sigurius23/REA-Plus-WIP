package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import p692zt.AbstractServiceC41104h;
import p692zt.C41112p;
import p692zt.C41113q;
import so.C32785b;
import zd3.C40580x;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC41104h {

    /* JADX INFO: renamed from: G */
    private static final Queue<String> f21624G = new ArrayDeque(10);

    /* JADX INFO: renamed from: F */
    private C32785b f21625F;

    @Override // p692zt.AbstractServiceC41104h
    /* JADX INFO: renamed from: c */
    public Intent mo16394c(Intent intent) {
        return (Intent) ((ArrayDeque) C41113q.m133448u().f177222E).poll();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x0125  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    @Override // p692zt.AbstractServiceC41104h
    /* JADX INFO: renamed from: d */
    public void mo16395d(Intent intent) {
        String stringExtra;
        Bundle extras;
        C40580x c40580x;
        ExecutorService executorServiceNewSingleThreadExecutor;
        String stringExtra2;
        int i13;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                mo16399j(intent.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra3 = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra3)) {
            stringExtra = intent.getStringExtra("message_type");
            if (stringExtra == null) {
                stringExtra = "gcm";
            }
            switch (stringExtra) {
                case -2062414158:
                    if (stringExtra.equals("deleted_messages")) {
                    }
                    break;
                case 102161:
                    if (stringExtra.equals("gcm")) {
                    }
                    break;
                case 814694033:
                    if (stringExtra.equals("send_error")) {
                    }
                    break;
                case 814800675:
                    if (stringExtra.equals("send_event")) {
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                Method dump skipped, instruction units count: 456
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.mo16395d(android.content.Intent):void");
        }

        /* JADX INFO: renamed from: g */
        public void m16396g() {
        }

        /* JADX INFO: renamed from: h */
        public void mo16397h(C41112p c41112p) {
        }

        /* JADX INFO: renamed from: i */
        public void m16398i(String str) {
        }

        /* JADX INFO: renamed from: j */
        public void mo16399j(String str) {
        }

        /* JADX INFO: renamed from: k */
        public void m16400k(String str, Exception exc) {
        }
    }
