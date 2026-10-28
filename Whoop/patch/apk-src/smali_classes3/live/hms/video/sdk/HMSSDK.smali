.class public final Llive/hms/video/sdk/HMSSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/HMSSDK$Builder;,
        Llive/hms/video/sdk/HMSSDK$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u0089\u00022\u00020\u0001:\u0004\u0089\u0002\u008a\u0002BQ\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0008\u0012\u0006\u0010\u0011\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u0019\u0010\u001fJ\r\u0010 \u001a\u00020\u0018\u00a2\u0006\u0004\u0008 \u0010!J\u001d\u0010$\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008$\u0010%J\u0019\u0010(\u001a\u00020\u00182\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010&\u00a2\u0006\u0004\u0008(\u0010)J\u000f\u0010+\u001a\u0004\u0018\u00010*\u00a2\u0006\u0004\u0008+\u0010,J\u0013\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0004\u0008/\u00100J\u0013\u00102\u001a\u0008\u0012\u0004\u0012\u0002010-\u00a2\u0006\u0004\u00082\u00100J\'\u00108\u001a\u00020\u00182\u0006\u00104\u001a\u0002032\u0008\u0008\u0002\u00105\u001a\u0002032\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u00088\u00109J/\u0010;\u001a\u00020\u00182\u0006\u00104\u001a\u0002032\u0008\u0008\u0002\u00105\u001a\u0002032\u0006\u0010:\u001a\u00020.2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008;\u0010<J5\u0010>\u001a\u00020\u00182\u0006\u00104\u001a\u0002032\u0008\u0008\u0002\u00105\u001a\u0002032\u000c\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u001b0-2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008>\u0010?J\u0015\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u00020@\u00a2\u0006\u0004\u0008B\u0010CJ\r\u0010D\u001a\u00020\u0018\u00a2\u0006\u0004\u0008D\u0010!J\u0013\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u001b0-\u00a2\u0006\u0004\u0008E\u00100J+\u0010H\u001a\u00020\u00182\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u001b0-2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008H\u0010IJ/\u0010L\u001a\u00020\u00182\u0006\u0010J\u001a\u00020.2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020&H\u0007\u00a2\u0006\u0004\u0008L\u0010MJ-\u0010N\u001a\u00020\u00182\u0006\u0010J\u001a\u00020.2\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008N\u0010MJ\u001d\u0010Q\u001a\u00020\u00182\u0006\u0010P\u001a\u00020O2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008Q\u0010RJ%\u0010U\u001a\u00020\u00182\u0006\u0010S\u001a\u0002012\u0006\u0010T\u001a\u0002032\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008U\u0010VJ%\u0010X\u001a\u00020\u00182\u0006\u0010T\u001a\u0002032\u0006\u0010W\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008X\u0010YJ%\u0010]\u001a\u00020\u00182\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008]\u0010^JA\u0010]\u001a\u00020\u00182\u0006\u0010\\\u001a\u00020\u00082\u0008\u00105\u001a\u0004\u0018\u00010_2\u0008\u0010`\u001a\u0004\u0018\u0001032\u000e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010-2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008]\u0010bJ\u001d\u0010d\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020c2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008d\u0010eJ!\u0010g\u001a\u00020\u00182\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010f2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008g\u0010hJ!\u0010i\u001a\u00020\u00182\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010f2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008i\u0010hJ\u0015\u0010j\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008j\u0010)J\u000f\u0010l\u001a\u0004\u0018\u00010k\u00a2\u0006\u0004\u0008l\u0010mJ+\u0010r\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020&2\u0008\u0010o\u001a\u0004\u0018\u00010n2\n\u0008\u0002\u0010q\u001a\u0004\u0018\u00010p\u00a2\u0006\u0004\u0008r\u0010sJ\r\u0010t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008t\u0010uJ\u0015\u0010v\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008v\u0010)J7\u0010z\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020&2\u0008\u0010o\u001a\u0004\u0018\u00010n2\u0008\u0008\u0002\u0010x\u001a\u00020w2\n\u0008\u0002\u0010y\u001a\u0004\u0018\u00010pH\u0007\u00a2\u0006\u0004\u0008z\u0010{J\u0015\u0010|\u001a\u00020\u00182\u0006\u0010x\u001a\u00020w\u00a2\u0006\u0004\u0008|\u0010}J\u0015\u0010~\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008~\u0010)J#\u0010\u0081\u0001\u001a\u00020\u00182\t\u0008\u0001\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0006\u0008\u0081\u0001\u0010\u0082\u0001J\u0017\u0010\u0083\u0001\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0005\u0008\u0083\u0001\u0010)J-\u0010\u0087\u0001\u001a\u00020\u00182\u0008\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0006\u0010\'\u001a\u00020&2\t\u0008\u0002\u0010\u0086\u0001\u001a\u00020\u007f\u00a2\u0006\u0006\u0008\u0087\u0001\u0010\u0088\u0001J\"\u0010\u0089\u0001\u001a\u00020\u00182\u0008\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0006\u0008\u0089\u0001\u0010\u008a\u0001J\u0018\u0010\u008b\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0084\u0001\u0018\u00010-\u00a2\u0006\u0005\u0008\u008b\u0001\u00100J!\u0010\u008d\u0001\u001a\u00020\u00182\u0007\u0010\u008c\u0001\u001a\u0002032\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0006\u0008\u008d\u0001\u0010\u008e\u0001J!\u0010\u0090\u0001\u001a\u00020\u00182\u0007\u0010\u008f\u0001\u001a\u0002032\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u008e\u0001J\u0018\u0010\u0092\u0001\u001a\u00020\u00182\u0007\u0010\u0091\u0001\u001a\u00020&\u00a2\u0006\u0005\u0008\u0092\u0001\u0010)J\u0018\u0010\u0093\u0001\u001a\u00020\u00182\u0007\u0010\u0091\u0001\u001a\u00020&\u00a2\u0006\u0005\u0008\u0093\u0001\u0010)J!\u0010\u0094\u0001\u001a\u00020\u00182\u0006\u0010J\u001a\u00020.2\u0007\u0010\u0091\u0001\u001a\u00020&\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0095\u0001J\u001f\u0010\u0099\u0001\u001a\u00030\u0098\u00012\u000c\u0008\u0002\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001\u00a2\u0006\u0006\u0008\u0099\u0001\u0010\u009a\u0001J\u0019\u0010\u009c\u0001\u001a\u00020\u00182\u0007\u0010\u009b\u0001\u001a\u00020\u007f\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009d\u0001J\u001a\u0010\u00a0\u0001\u001a\u00020\u00182\u0008\u0010\u009f\u0001\u001a\u00030\u009e\u0001\u00a2\u0006\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001J\u001a\u0010\u00a4\u0001\u001a\u00020\u00182\u0008\u0010\u00a3\u0001\u001a\u00030\u00a2\u0001\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001J\u0011\u0010\u00a6\u0001\u001a\u00030\u009e\u0001\u00a2\u0006\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001J\u0016\u0010\u00a8\u0001\u001a\t\u0012\u0005\u0012\u00030\u009e\u00010-\u00a2\u0006\u0005\u0008\u00a8\u0001\u00100J\u0016\u0010\u00aa\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a9\u00010-\u00a2\u0006\u0005\u0008\u00aa\u0001\u00100J\u0019\u0010\u00ac\u0001\u001a\u00020\u00182\u0007\u0010A\u001a\u00030\u00ab\u0001\u00a2\u0006\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001J\u000f\u0010\u00ae\u0001\u001a\u00020\u0018\u00a2\u0006\u0005\u0008\u00ae\u0001\u0010!J(\u0010\u00b0\u0001\u001a\u00020\u00182\u000e\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u00af\u00010-2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001J\u001a\u0010\u00b4\u0001\u001a\u00020\u00182\u0008\u0010\u00b3\u0001\u001a\u00030\u00b2\u0001\u00a2\u0006\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001J2\u0010\u00bc\u0001\u001a\u00020\u00182\u0008\u0010\u00b7\u0001\u001a\u00030\u00b6\u00012\u000c\u0008\u0002\u0010\u00b9\u0001\u001a\u0005\u0018\u00010\u00b8\u00012\u0008\u0010\u00bb\u0001\u001a\u00030\u00ba\u0001\u00a2\u0006\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001J\u0011\u0010\u00bf\u0001\u001a\u00030\u00be\u0001\u00a2\u0006\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001J\u0011\u0010\u00c2\u0001\u001a\u00030\u00c1\u0001\u00a2\u0006\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001J\u000f\u0010\u00c4\u0001\u001a\u00020\u0018\u00a2\u0006\u0005\u0008\u00c4\u0001\u0010!J1\u0010\u00ca\u0001\u001a\u00020\u00182\u0007\u0010\u00c5\u0001\u001a\u0002032\u000c\u0008\u0002\u0010\u00c7\u0001\u001a\u0005\u0018\u00010\u00c6\u00012\u0008\u0010\u00c9\u0001\u001a\u00030\u00c8\u0001\u00a2\u0006\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001J\u001b\u0010\u00cd\u0001\u001a\u00020\u00182\u0007\u0010\u00cc\u0001\u001a\u00020\u0008H\u0007\u00a2\u0006\u0006\u0008\u00cd\u0001\u0010\u00ce\u0001J!\u0010\u00cf\u0001\u001a\u00020\u00182\u0007\u0010\u00cc\u0001\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0006\u0008\u00cf\u0001\u0010\u00d0\u0001J\u0011\u0010\u00d1\u0001\u001a\u00020\u0008H\u0007\u00a2\u0006\u0005\u0008\u00d1\u0001\u0010uJ\u000f\u0010\u00d2\u0001\u001a\u00020\u0008\u00a2\u0006\u0005\u0008\u00d2\u0001\u0010uJ\"\u0010\u00d5\u0001\u001a\u00020\u00182\u0008\u0010\u00d4\u0001\u001a\u00030\u00d3\u00012\u0006\u0010\u0017\u001a\u00020&\u00a2\u0006\u0006\u0008\u00d5\u0001\u0010\u00d6\u0001J\"\u0010\u00d7\u0001\u001a\u00020\u00182\u0008\u0010\u00d4\u0001\u001a\u00030\u00d3\u00012\u0006\u0010\u0017\u001a\u00020&\u00a2\u0006\u0006\u0008\u00d7\u0001\u0010\u00d6\u0001J\u0013\u0010\u00d9\u0001\u001a\u00030\u00d8\u0001H\u0007\u00a2\u0006\u0006\u0008\u00d9\u0001\u0010\u00da\u0001J\u0011\u0010\u00db\u0001\u001a\u00030\u00d8\u0001\u00a2\u0006\u0006\u0008\u00db\u0001\u0010\u00da\u0001J\u001b\u0010\u00dd\u0001\u001a\u0004\u0018\u00010.2\u0007\u0010\u00dc\u0001\u001a\u000203\u00a2\u0006\u0006\u0008\u00dd\u0001\u0010\u00de\u0001J\u001c\u0010\u00e1\u0001\u001a\u00030\u00e0\u00012\t\u0010\u00df\u0001\u001a\u0004\u0018\u000103\u00a2\u0006\u0006\u0008\u00e1\u0001\u0010\u00e2\u0001J<\u0010\u00e9\u0001\u001a\u00020\u00182\u0007\u0010\u00e3\u0001\u001a\u0002032\u0007\u0010\u00e4\u0001\u001a\u00020\u007f2\u0008\u0010\u00e6\u0001\u001a\u00030\u00e5\u00012\u000e\u0010\u0017\u001a\n\u0012\u0005\u0012\u00030\u00e8\u00010\u00e7\u0001\u00a2\u0006\u0006\u0008\u00e9\u0001\u0010\u00ea\u0001J\u0011\u0010\u00eb\u0001\u001a\u00020\u0018H\u0002\u00a2\u0006\u0005\u0008\u00eb\u0001\u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000f\n\u0005\u0008\u0003\u0010\u00ec\u0001\u001a\u0006\u0008\u00ed\u0001\u0010\u00ee\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0005\u0010\u00ef\u0001R\u001a\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000f\n\u0005\u0008\u0007\u0010\u00f0\u0001\u001a\u0006\u0008\u00f1\u0001\u0010\u00f2\u0001R\u0019\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000e\n\u0005\u0008\t\u0010\u00f3\u0001\u001a\u0005\u0008\u00f4\u0001\u0010uR\u001a\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000f\n\u0005\u0008\u000b\u0010\u00f5\u0001\u001a\u0006\u0008\u00f6\u0001\u0010\u00f7\u0001R\u001a\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000f\n\u0005\u0008\r\u0010\u00f8\u0001\u001a\u0006\u0008\u00f9\u0001\u0010\u00fa\u0001R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000f\n\u0005\u0008\u000f\u0010\u00fb\u0001\u001a\u0006\u0008\u00fc\u0001\u0010\u00fd\u0001R\u0019\u0010\u0010\u001a\u00020\u00088\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0010\u0010\u00f3\u0001\u001a\u0005\u0008\u00fe\u0001\u0010uR\u0019\u0010\u0011\u001a\u00020\u00088\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0011\u0010\u00f3\u0001\u001a\u0005\u0008\u00ff\u0001\u0010uR\u0018\u0010\u0081\u0002\u001a\u00030\u0080\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0002\u0010\u0082\u0002R\u0018\u0010\u0084\u0002\u001a\u00030\u0083\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0084\u0002\u0010\u0085\u0002R\u0018\u0010\u0087\u0002\u001a\u00030\u0086\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0002\u0010\u0088\u0002\u00a8\u0006\u008b\u0002"
    }
    d2 = {
        "Llive/hms/video/sdk/HMSSDK;",
        "",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "hmsSettings",
        "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;",
        "hmsAnalyticsEventLevel",
        "Llive/hms/video/utils/HMSLogger$LogLevel;",
        "hmsWebRtcLogLevel",
        "",
        "shouldSkipPIIEvents",
        "Landroid/content/Context;",
        "applicationContext",
        "Llive/hms/video/media/settings/HMSLogSettings;",
        "hmsLogSettings",
        "Llive/hms/video/sdk/models/FrameworkInfo;",
        "frameworkInfo",
        "haltPreviewJoinForPermissions",
        "iceGatheringOnAnyAddressPorts",
        "<init>",
        "(Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/utils/HMSLogger$LogLevel;ZLandroid/content/Context;Llive/hms/video/media/settings/HMSLogSettings;Llive/hms/video/sdk/models/FrameworkInfo;ZZ)V",
        "Llive/hms/video/sdk/models/HMSConfig;",
        "config",
        "Llive/hms/video/sdk/HMSPreviewListener;",
        "listener",
        "Ll83/a0;",
        "preview",
        "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "forRole",
        "Llive/hms/video/sdk/RolePreviewListener;",
        "rolePreviewListener",
        "(Llive/hms/video/sdk/models/role/HMSRole;Llive/hms/video/sdk/RolePreviewListener;)V",
        "cancelPreview",
        "()V",
        "Llive/hms/video/sdk/HMSUpdateListener;",
        "hmsUpdateListener",
        "join",
        "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSUpdateListener;)V",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "hmsActionResultListener",
        "leave",
        "(Llive/hms/video/sdk/HMSActionResultListener;)V",
        "Llive/hms/video/sdk/models/HMSLocalPeer;",
        "getLocalPeer",
        "()Llive/hms/video/sdk/models/HMSLocalPeer;",
        "",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "getPeers",
        "()Ljava/util/List;",
        "Llive/hms/video/sdk/models/HMSRemotePeer;",
        "getRemotePeers",
        "",
        "message",
        "type",
        "Llive/hms/video/sdk/HMSMessageResultListener;",
        "hmsMessageResultListener",
        "sendBroadcastMessage",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/HMSMessageResultListener;)V",
        "peerTo",
        "sendDirectMessage",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSMessageResultListener;)V",
        "hmsRolesTo",
        "sendGroupMessage",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSMessageResultListener;)V",
        "Llive/hms/video/sdk/HMSAudioListener;",
        "observer",
        "addAudioObserver",
        "(Llive/hms/video/sdk/HMSAudioListener;)V",
        "removeAudioObserver",
        "getRoles",
        "ofRoles",
        "toRole",
        "changeRoleOfPeersWithRoles",
        "(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "forPeer",
        "force",
        "changeRole",
        "(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;)V",
        "changeRoleOfPeer",
        "Llive/hms/video/sdk/models/HMSRoleChangeRequest;",
        "request",
        "acceptChangeRole",
        "(Llive/hms/video/sdk/models/HMSRoleChangeRequest;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "peer",
        "reason",
        "removePeerRequest",
        "(Llive/hms/video/sdk/models/HMSRemotePeer;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "lock",
        "endRoom",
        "(Ljava/lang/String;ZLlive/hms/video/sdk/HMSActionResultListener;)V",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "forRemoteTrack",
        "mute",
        "changeTrackState",
        "(Llive/hms/video/media/tracks/HMSTrack;ZLlive/hms/video/sdk/HMSActionResultListener;)V",
        "Llive/hms/video/media/tracks/HMSTrackType;",
        "source",
        "roles",
        "(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "Llive/hms/video/sdk/models/HMSRecordingConfig;",
        "startRtmpOrRecording",
        "(Llive/hms/video/sdk/models/HMSRecordingConfig;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "Llive/hms/video/sdk/models/HMSHLSConfig;",
        "startHLSStreaming",
        "(Llive/hms/video/sdk/models/HMSHLSConfig;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "stopHLSStreaming",
        "stopRtmpAndRecording",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "getRoom",
        "()Llive/hms/video/sdk/models/HMSRoom;",
        "Landroid/content/Intent;",
        "mediaProjectionPermissionResultData",
        "Landroid/app/Notification;",
        "screenShareNotification",
        "startScreenshare",
        "(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Landroid/app/Notification;)V",
        "isScreenShared",
        "()Z",
        "stopScreenshare",
        "Llive/hms/video/sdk/models/enums/AudioMixingMode;",
        "audioMixingMode",
        "audioShareNotification",
        "startAudioshare",
        "(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)V",
        "setAudioMixingMode",
        "(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V",
        "stopAudioshare",
        "",
        "audioResourceId",
        "streamAndPlayAudioFromRawFile",
        "(ILlive/hms/video/sdk/HMSActionResultListener;)V",
        "stopAudioFromRawFile",
        "Llive/hms/video/plugin/video/HMSVideoPlugin;",
        "plugin",
        "pluginFrameRate",
        "addPlugin",
        "(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V",
        "removePlugin",
        "(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "getPlugins",
        "name",
        "changeName",
        "(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "metadata",
        "changeMetadata",
        "actionlistener",
        "raiseLocalPeerHand",
        "lowerLocalPeerHand",
        "lowerRemotePeerHand",
        "(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "Llive/hms/video/sdk/models/PeerListIteratorOptions;",
        "peerListIteratorOptions",
        "Llive/hms/video/sdk/models/PeerListIterator;",
        "getPeerListIterator",
        "(Llive/hms/video/sdk/models/PeerListIteratorOptions;)Llive/hms/video/sdk/models/PeerListIterator;",
        "audioMode",
        "setAudioMode",
        "(I)V",
        "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
        "audioDevice",
        "switchAudioOutput",
        "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)V",
        "Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;",
        "audioManageDeviceChangeDeviceChangeListener",
        "setAudioDeviceChangeListener",
        "(Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;)V",
        "getAudioOutputRouteType",
        "()Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
        "getAudioDevicesList",
        "Llive/hms/video/audio/HMSAudioDeviceInfo;",
        "getAudioDevicesInfoList",
        "Llive/hms/video/connection/stats/HMSStatsObserver;",
        "addRtcStatsObserver",
        "(Llive/hms/video/connection/stats/HMSStatsObserver;)V",
        "removeRtcStatsObserver",
        "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;",
        "setHlsSessionMetadata",
        "(Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "Llive/hms/video/error/HMSException;",
        "hmsException",
        "sendErrorEvent",
        "(Llive/hms/video/error/HMSException;)V",
        "Llive/hms/video/signal/init/TokenRequest;",
        "tokenRequest",
        "Llive/hms/video/signal/init/TokenRequestOptions;",
        "tokenRequestOptions",
        "Llive/hms/video/signal/init/HMSTokenListener;",
        "hmsTokenListener",
        "getAuthTokenByRoomCode",
        "(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V",
        "Llive/hms/video/whiteboard/HMSWhiteboardPermissions;",
        "getWhiteboardPermissions",
        "()Llive/hms/video/whiteboard/HMSWhiteboardPermissions;",
        "Llive/hms/video/interactivity/HmsInteractivityCenter;",
        "getHmsInteractivityCenter",
        "()Llive/hms/video/interactivity/HmsInteractivityCenter;",
        "setPermissionsAccepted",
        "authToken",
        "Llive/hms/video/signal/init/LayoutRequestOptions;",
        "layoutRequestOptions",
        "Llive/hms/video/signal/init/HMSLayoutListener;",
        "layoutListener",
        "getRoomLayout",
        "(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V",
        "enable",
        "setNoiseCancellationEnabled",
        "(Z)V",
        "enableNoiseCancellation",
        "(ZLlive/hms/video/sdk/HMSActionResultListener;)V",
        "getNoiseCancellationEnabled",
        "isNoiseCancellationEnabled",
        "Llive/hms/video/sdk/models/TranscriptionsMode;",
        "mode",
        "startRealTimeTranscription",
        "(Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/HMSActionResultListener;)V",
        "stopRealTimeTranscription",
        "Llive/hms/video/factories/noisecancellation/AvailabilityStatus;",
        "isNoiseCancellationAvailable",
        "()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;",
        "isNoiseCancellationSupported",
        "peerId",
        "getPeerById",
        "(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;",
        "customerUserId",
        "Llive/hms/video/diagnostics/HMSDiagnostics;",
        "getDiagnosticsSDK",
        "(Ljava/lang/String;)Llive/hms/video/diagnostics/HMSDiagnostics;",
        "query",
        "limit",
        "",
        "offset",
        "Llive/hms/video/sdk/HmsTypedActionResultListener;",
        "Llive/hms/video/sdk/models/PeerSearchResponse;",
        "searchPeerNameInLargeRoom",
        "(Ljava/lang/String;IJLlive/hms/video/sdk/HmsTypedActionResultListener;)V",
        "initLogStorage",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "getHmsSettings",
        "()Llive/hms/video/media/settings/HMSTrackSettings;",
        "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;",
        "Llive/hms/video/utils/HMSLogger$LogLevel;",
        "getHmsWebRtcLogLevel",
        "()Llive/hms/video/utils/HMSLogger$LogLevel;",
        "Z",
        "getShouldSkipPIIEvents",
        "Landroid/content/Context;",
        "getApplicationContext",
        "()Landroid/content/Context;",
        "Llive/hms/video/media/settings/HMSLogSettings;",
        "getHmsLogSettings",
        "()Llive/hms/video/media/settings/HMSLogSettings;",
        "Llive/hms/video/sdk/models/FrameworkInfo;",
        "getFrameworkInfo",
        "()Llive/hms/video/sdk/models/FrameworkInfo;",
        "getHaltPreviewJoinForPermissions",
        "getIceGatheringOnAnyAddressPorts",
        "Lmc3/a;",
        "joinLeavePreviewMutex",
        "Lmc3/a;",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "Llive/hms/video/sdk/SDKStore;",
        "Llive/hms/video/sdk/SDKDelegate;",
        "delegate",
        "Llive/hms/video/sdk/SDKDelegate;",
        "Companion",
        "Builder",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llive/hms/video/sdk/HMSSDK$Companion;

.field public static final VERSION:Ljava/lang/String; = "2.9.87"

.field public static final WEBRTC_VERSION:Ljava/lang/String; = "m111-hms-1.94.3"


# instance fields
.field private final applicationContext:Landroid/content/Context;

.field private final delegate:Llive/hms/video/sdk/SDKDelegate;

.field private final frameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

.field private final haltPreviewJoinForPermissions:Z

.field private final hmsAnalyticsEventLevel:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

.field private final hmsLogSettings:Llive/hms/video/media/settings/HMSLogSettings;

.field private final hmsSettings:Llive/hms/video/media/settings/HMSTrackSettings;

.field private final hmsWebRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;

.field private final iceGatheringOnAnyAddressPorts:Z

.field private final joinLeavePreviewMutex:Lmc3/a;

.field private final shouldSkipPIIEvents:Z

.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/sdk/HMSSDK$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/sdk/HMSSDK$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/sdk/HMSSDK;->Companion:Llive/hms/video/sdk/HMSSDK$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/utils/HMSLogger$LogLevel;ZLandroid/content/Context;Llive/hms/video/media/settings/HMSLogSettings;Llive/hms/video/sdk/models/FrameworkInfo;ZZ)V
    .locals 9

    move-object/from16 v6, p7

    const-string v0, "hmsSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsAnalyticsEventLevel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsWebRtcLogLevel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsLogSettings"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frameworkInfo"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK;->hmsSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    iput-object p2, p0, Llive/hms/video/sdk/HMSSDK;->hmsAnalyticsEventLevel:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    iput-object p3, p0, Llive/hms/video/sdk/HMSSDK;->hmsWebRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;

    iput-boolean p4, p0, Llive/hms/video/sdk/HMSSDK;->shouldSkipPIIEvents:Z

    iput-object p5, p0, Llive/hms/video/sdk/HMSSDK;->applicationContext:Landroid/content/Context;

    iput-object p6, p0, Llive/hms/video/sdk/HMSSDK;->hmsLogSettings:Llive/hms/video/media/settings/HMSLogSettings;

    iput-object v6, p0, Llive/hms/video/sdk/HMSSDK;->frameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

    move/from16 v7, p8

    iput-boolean v7, p0, Llive/hms/video/sdk/HMSSDK;->haltPreviewJoinForPermissions:Z

    move/from16 v8, p9

    iput-boolean v8, p0, Llive/hms/video/sdk/HMSSDK;->iceGatheringOnAnyAddressPorts:Z

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p3

    iput-object p3, p0, Llive/hms/video/sdk/HMSSDK;->joinLeavePreviewMutex:Lmc3/a;

    new-instance v4, Llive/hms/video/sdk/SDKStore;

    const/4 p3, 0x3

    const/4 p4, 0x0

    invoke-direct {v4, p4, p4, p3, p4}, Llive/hms/video/sdk/SDKStore;-><init>(Ljava/util/Map;Ljava/util/concurrent/ConcurrentHashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v4, p0, Llive/hms/video/sdk/HMSSDK;->store:Llive/hms/video/sdk/SDKStore;

    new-instance v0, Llive/hms/video/sdk/SDKDelegate;

    move-object v2, p1

    move-object v5, p2

    move-object v1, p5

    move-object v3, p6

    invoke-direct/range {v0 .. v8}, Llive/hms/video/sdk/SDKDelegate;-><init>(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/media/settings/HMSLogSettings;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/sdk/models/FrameworkInfo;ZZ)V

    iput-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    return-void
.end method

.method public static final synthetic access$getDelegate$p(Llive/hms/video/sdk/HMSSDK;)Llive/hms/video/sdk/SDKDelegate;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    return-object p0
.end method

.method public static final synthetic access$getJoinLeavePreviewMutex$p(Llive/hms/video/sdk/HMSSDK;)Lmc3/a;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sdk/HMSSDK;->joinLeavePreviewMutex:Lmc3/a;

    return-object p0
.end method

.method public static synthetic addPlugin$default(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/16 p3, 0xf

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/HMSSDK;->addPlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V

    return-void
.end method

.method public static synthetic getAuthTokenByRoomCode$default(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/HMSSDK;->getAuthTokenByRoomCode(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V

    return-void
.end method

.method public static synthetic getPeerListIterator$default(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/models/PeerListIteratorOptions;ILjava/lang/Object;)Llive/hms/video/sdk/models/PeerListIterator;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Llive/hms/video/sdk/HMSSDK;->getPeerListIterator(Llive/hms/video/sdk/models/PeerListIteratorOptions;)Llive/hms/video/sdk/models/PeerListIterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getRoomLayout$default(Llive/hms/video/sdk/HMSSDK;Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/HMSSDK;->getRoomLayout(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V

    return-void
.end method

.method private final initLogStorage()V
    .locals 4

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;-><init>(Llive/hms/video/sdk/HMSSDK;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic leave$default(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/HMSActionResultListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Llive/hms/video/sdk/HMSSDK;->leave(Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public static synthetic sendBroadcastMessage$default(Llive/hms/video/sdk/HMSSDK;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/HMSMessageResultListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-string p2, "chat"

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/HMSSDK;->sendBroadcastMessage(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/HMSMessageResultListener;)V

    return-void
.end method

.method public static synthetic sendDirectMessage$default(Llive/hms/video/sdk/HMSSDK;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSMessageResultListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const-string p2, "chat"

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/HMSSDK;->sendDirectMessage(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSMessageResultListener;)V

    return-void
.end method

.method public static synthetic sendGroupMessage$default(Llive/hms/video/sdk/HMSSDK;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSMessageResultListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const-string p2, "chat"

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/HMSSDK;->sendGroupMessage(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSMessageResultListener;)V

    return-void
.end method

.method public static synthetic startAudioshare$default(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    sget-object p3, Llive/hms/video/sdk/models/enums/AudioMixingMode;->TALK_AND_MUSIC:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/HMSSDK;->startAudioshare(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)V

    return-void
.end method

.method public static synthetic startHLSStreaming$default(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/models/HMSHLSConfig;Llive/hms/video/sdk/HMSActionResultListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/HMSSDK;->startHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public static synthetic startScreenshare$default(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Landroid/app/Notification;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/HMSSDK;->startScreenshare(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Landroid/app/Notification;)V

    return-void
.end method

.method public static synthetic stopHLSStreaming$default(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/models/HMSHLSConfig;Llive/hms/video/sdk/HMSActionResultListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/HMSSDK;->stopHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method


# virtual methods
.method public final acceptChangeRole(Llive/hms/video/sdk/models/HMSRoleChangeRequest;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->roleChangeAccept(Llive/hms/video/sdk/models/HMSRoleChangeRequest;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final addAudioObserver(Llive/hms/video/sdk/HMSAudioListener;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->setAudioObserver(Llive/hms/video/sdk/HMSAudioListener;)V

    return-void
.end method

.method public final addPlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V
    .locals 1

    const-string v0, "plugin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2, p3}, Llive/hms/video/sdk/SDKDelegate;->addPlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V

    return-void
.end method

.method public final addRtcStatsObserver(Llive/hms/video/connection/stats/HMSStatsObserver;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->addStatsObserver(Llive/hms/video/connection/stats/HMSStatsObserver;)V

    return-void
.end method

.method public final cancelPreview()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->cancelRolePreview()V

    return-void
.end method

.method public final changeMetadata(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->changeMetadata(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final changeName(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->changeName(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final changeRole(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const-string v0, "forPeer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toRole"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/HMSSDK;->changeRoleOfPeer(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final changeRoleOfPeer(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "forPeer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toRole"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2, p3, p4}, Llive/hms/video/sdk/SDKDelegate;->roleChangeRequest(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final changeRoleOfPeersWithRoles(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            ")V"
        }
    .end annotation

    const-string v0, "ofRoles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toRole"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1, p3}, Llive/hms/video/sdk/SDKDelegate;->bulkRoleChangeRequest(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final changeTrackState(Llive/hms/video/media/tracks/HMSTrack;ZLlive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "forRemoteTrack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2, p3}, Llive/hms/video/sdk/SDKDelegate;->changeTrackState(Llive/hms/video/media/tracks/HMSTrack;ZLlive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final changeTrackState(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Llive/hms/video/media/tracks/HMSTrackType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            ")V"
        }
    .end annotation

    const-string v0, "hmsActionResultListener"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    if-eqz p4, :cond_1

    check-cast p4, Ljava/lang/Iterable;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p4, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 5
    check-cast v2, Llive/hms/video/sdk/models/role/HMSRole;

    .line 6
    invoke-virtual {v2}, Llive/hms/video/sdk/models/role/HMSRole;->getName()Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    :goto_1
    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    move-object v5, v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 8
    :goto_2
    invoke-virtual/range {v1 .. v6}, Llive/hms/video/sdk/SDKDelegate;->changeTrackState(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final enableNoiseCancellation(ZLlive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->enableNoiseCancellation(ZLlive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final endRoom(Ljava/lang/String;ZLlive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2, p3}, Llive/hms/video/sdk/SDKDelegate;->endRoom(Ljava/lang/String;ZLlive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final getApplicationContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->applicationContext:Landroid/content/Context;

    return-object v0
.end method

.method public final getAudioDevicesInfoList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/audio/HMSAudioDeviceInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->getAvailableAudioDevicesInfoList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getAudioDevicesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->getAvailableAudioDevicesList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getAudioOutputRouteType()Llive/hms/video/audio/HMSAudioManager$AudioDevice;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->getAudioOutputRouteType()Llive/hms/video/audio/HMSAudioManager$AudioDevice;

    move-result-object v0

    return-object v0
.end method

.method public final getAuthTokenByRoomCode(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V
    .locals 1

    const-string v0, "tokenRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsTokenListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2, p3}, Llive/hms/video/sdk/SDKDelegate;->getAuthTokenByRoomCode(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V

    return-void
.end method

.method public final getDiagnosticsSDK(Ljava/lang/String;)Llive/hms/video/diagnostics/HMSDiagnostics;
    .locals 2

    new-instance v0, Llive/hms/video/diagnostics/HMSDiagnostics;

    iget-object v1, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-direct {v0, v1, p1}, Llive/hms/video/diagnostics/HMSDiagnostics;-><init>(Llive/hms/video/sdk/SDKDelegate;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getFrameworkInfo()Llive/hms/video/sdk/models/FrameworkInfo;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->frameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

    return-object v0
.end method

.method public final getHaltPreviewJoinForPermissions()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/HMSSDK;->haltPreviewJoinForPermissions:Z

    return v0
.end method

.method public final getHmsInteractivityCenter()Llive/hms/video/interactivity/HmsInteractivityCenter;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->getHmsInteractivityCenter()Llive/hms/video/interactivity/HmsInteractivityCenter;

    move-result-object v0

    return-object v0
.end method

.method public final getHmsLogSettings()Llive/hms/video/media/settings/HMSLogSettings;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->hmsLogSettings:Llive/hms/video/media/settings/HMSLogSettings;

    return-object v0
.end method

.method public final getHmsSettings()Llive/hms/video/media/settings/HMSTrackSettings;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->hmsSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    return-object v0
.end method

.method public final getHmsWebRtcLogLevel()Llive/hms/video/utils/HMSLogger$LogLevel;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->hmsWebRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;

    return-object v0
.end method

.method public final getIceGatheringOnAnyAddressPorts()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/HMSSDK;->iceGatheringOnAnyAddressPorts:Z

    return v0
.end method

.method public final getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v0

    return-object v0
.end method

.method public final getNoiseCancellationEnabled()Z
    .locals 1
    .annotation runtime Ll83/c;
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public final getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;
    .locals 1

    const-string v0, "peerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p1

    return-object p1
.end method

.method public final getPeerListIterator(Llive/hms/video/sdk/models/PeerListIteratorOptions;)Llive/hms/video/sdk/models/PeerListIterator;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->getPeerListIterator(Llive/hms/video/sdk/models/PeerListIteratorOptions;)Llive/hms/video/sdk/models/PeerListIterator;

    move-result-object p1

    return-object p1
.end method

.method public final getPeers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSPeer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getPeers()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getPlugins()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/plugin/video/HMSVideoPlugin;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->getPlugins()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final getRemotePeers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSRemotePeer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getRemotePeers()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getRoles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getRolesMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getRoom()Llive/hms/video/sdk/models/HMSRoom;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->get_room()Llive/hms/video/sdk/models/HMSRoom;

    move-result-object v0

    return-object v0
.end method

.method public final getRoomLayout(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V
    .locals 1

    const-string v0, "authToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2, p3}, Llive/hms/video/sdk/SDKDelegate;->getLayoutConfigByToken(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V

    return-void
.end method

.method public final getShouldSkipPIIEvents()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/HMSSDK;->shouldSkipPIIEvents:Z

    return v0
.end method

.method public final getWhiteboardPermissions()Llive/hms/video/whiteboard/HMSWhiteboardPermissions;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->getWhiteboardPermissions()Llive/hms/video/whiteboard/HMSWhiteboardPermissions;

    move-result-object v0

    return-object v0
.end method

.method public final isNoiseCancellationAvailable()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;
    .locals 2
    .annotation runtime Ll83/c;
    .end annotation

    new-instance v0, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;

    const-string v1, "deprecated method, use isNoiseCancellationSupported"

    invoke-direct {v0, v1}, Llive/hms/video/factories/noisecancellation/AvailabilityStatus$NotAvailable;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final isNoiseCancellationEnabled()Z
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->isNoiseCancellationEnabled()Z

    move-result v0

    return v0
.end method

.method public final isNoiseCancellationSupported()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->isNoiseCancellationSupported()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;

    move-result-object v0

    return-object v0
.end method

.method public final isScreenShared()Z
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->isScreenShared()Z

    move-result v0

    return v0
.end method

.method public final join(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSUpdateListener;)V
    .locals 8

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsUpdateListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-boolean v0, p0, Llive/hms/video/sdk/HMSSDK;->haltPreviewJoinForPermissions:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->setPermissionsAccepted()V

    :cond_0
    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/sdk/HMSSDK$join$1;

    const/4 v7, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v7}, Llive/hms/video/sdk/HMSSDK$join$1;-><init>(JLlive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSUpdateListener;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final leave(Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 3

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/sdk/HMSSDK$leave$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llive/hms/video/sdk/HMSSDK$leave$1;-><init>(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final lowerLocalPeerHand(Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 2

    const-string v0, "actionlistener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Llive/hms/video/sdk/SDKDelegate;->changeLocalPeerHand(Llive/hms/video/sdk/HMSActionResultListener;Z)V

    return-void
.end method

.method public final lowerRemotePeerHand(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "forPeer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionlistener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->lowerRemotePeerHand(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final preview(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;)V
    .locals 3

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/sdk/HMSSDK$preview$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Llive/hms/video/sdk/HMSSDK$preview$1;-><init>(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final preview(Llive/hms/video/sdk/models/role/HMSRole;Llive/hms/video/sdk/RolePreviewListener;)V
    .locals 3

    const-string v0, "forRole"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rolePreviewListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/sdk/HMSSDK$preview$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Llive/hms/video/sdk/HMSSDK$preview$2;-><init>(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/sdk/models/role/HMSRole;Llive/hms/video/sdk/RolePreviewListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final raiseLocalPeerHand(Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 2

    const-string v0, "actionlistener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Llive/hms/video/sdk/SDKDelegate;->changeLocalPeerHand(Llive/hms/video/sdk/HMSActionResultListener;Z)V

    return-void
.end method

.method public final removeAudioObserver()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/SDKDelegate;->setAudioObserver(Llive/hms/video/sdk/HMSAudioListener;)V

    return-void
.end method

.method public final removePeerRequest(Llive/hms/video/sdk/models/HMSRemotePeer;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "peer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2, p3}, Llive/hms/video/sdk/SDKDelegate;->removePeer(Llive/hms/video/sdk/models/HMSRemotePeer;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final removePlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "plugin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->removePlugin(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final removeRtcStatsObserver()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->removeRtcStatsObserver()V

    return-void
.end method

.method public final searchPeerNameInLargeRoom(Ljava/lang/String;IJLlive/hms/video/sdk/HmsTypedActionResultListener;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IJ",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Llive/hms/video/sdk/models/PeerSearchResponse;",
            ">;)V"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Llive/hms/video/sdk/SDKDelegate;->searchPeerName(Ljava/lang/String;IJLlive/hms/video/sdk/HmsTypedActionResultListener;)V

    return-void
.end method

.method public final sendBroadcastMessage(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/HMSMessageResultListener;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsMessageResultListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p2, p1, p3}, Llive/hms/video/sdk/SDKDelegate;->sendMessage(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/HMSMessageResultListener;)V

    return-void
.end method

.method public final sendDirectMessage(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSMessageResultListener;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerTo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsMessageResultListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p2, p1, p3, p4}, Llive/hms/video/sdk/SDKDelegate;->sendMessage(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSMessageResultListener;)V

    return-void
.end method

.method public final sendErrorEvent(Llive/hms/video/error/HMSException;)V
    .locals 1

    const-string v0, "hmsException"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->sendErrorEvent(Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public final sendGroupMessage(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSMessageResultListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;",
            "Llive/hms/video/sdk/HMSMessageResultListener;",
            ")V"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsRolesTo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsMessageResultListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p2, p1, p3, p4}, Llive/hms/video/sdk/SDKDelegate;->sendMessage(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSMessageResultListener;)V

    return-void
.end method

.method public final setAudioDeviceChangeListener(Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;)V
    .locals 1

    const-string v0, "audioManageDeviceChangeDeviceChangeListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->setAudioDeviceChangeListener(Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;)V

    return-void
.end method

.method public final setAudioMixingMode(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V
    .locals 1

    const-string v0, "audioMixingMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->setAudioMixingMode(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V

    return-void
.end method

.method public final setAudioMode(I)V
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->setAudioMode(I)V

    return-void
.end method

.method public final setHlsSessionMetadata(Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;",
            ">;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            ")V"
        }
    .end annotation

    const-string v0, "metadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->setHlsSessionMetadata(Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final setNoiseCancellationEnabled(Z)V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public final setPermissionsAccepted()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKDelegate;->setPermissionsAccepted()V

    return-void
.end method

.method public final startAudioshare(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)V
    .locals 8

    const-string v0, "hmsActionResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioMixingMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2, p3, p4}, Llive/hms/video/sdk/SDKDelegate;->startAudioshare(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)V

    return-void

    :cond_0
    sget-object v1, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-string v3, "Minimum Android version needed to share system audio is 10"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Llive/hms/video/error/ErrorFactory$GenericErrors;->APINotSupported$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p2

    invoke-interface {p1, p2}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public final startHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->startHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final startRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->startRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final startRtmpOrRecording(Llive/hms/video/sdk/models/HMSRecordingConfig;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->startRtmpOrRecording(Llive/hms/video/sdk/models/HMSRecordingConfig;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final startScreenshare(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Landroid/app/Notification;)V
    .locals 1

    const-string v0, "hmsActionResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2, p3}, Llive/hms/video/sdk/SDKDelegate;->startScreenshare(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Landroid/app/Notification;)V

    return-void
.end method

.method public final stopAudioFromRawFile(Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "hmsActionResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->stopAudioFromRawFile(Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final stopAudioshare(Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "hmsActionResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->stopAudioshare(Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final stopHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->stopHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final stopRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->stopRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final stopRtmpAndRecording(Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "hmsActionResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->stopRtmpAndRecording(Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final stopScreenshare(Llive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "hmsActionResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->stopScreenshare(Llive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final streamAndPlayAudioFromRawFile(ILlive/hms/video/sdk/HMSActionResultListener;)V
    .locals 1

    const-string v0, "hmsActionResultListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1, p2}, Llive/hms/video/sdk/SDKDelegate;->streamAndPlayAudioFromRawFile(ILlive/hms/video/sdk/HMSActionResultListener;)V

    return-void
.end method

.method public final switchAudioOutput(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)V
    .locals 1

    const-string v0, "audioDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK;->delegate:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v0, p1}, Llive/hms/video/sdk/SDKDelegate;->switchAudioMode(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)V

    return-void
.end method
