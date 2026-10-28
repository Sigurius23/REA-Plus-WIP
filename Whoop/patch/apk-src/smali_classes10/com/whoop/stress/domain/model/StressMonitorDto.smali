.class public final Lcom/whoop/stress/domain/model/StressMonitorDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;,
        Lcom/whoop/stress/domain/model/StressMonitorDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u00083\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008G\u0008\u0087\u0008\u0018\u0000 \u00aa\u00012\u00020\u0001:\u0004\u00ab\u0001\u00ac\u0001B\u00ef\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0008\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010&\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u00a2\u0006\u0004\u0008*\u0010+B\u008d\u0002\u0008\u0010\u0012\u0006\u0010-\u001a\u00020,\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0008\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010&\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u0012\u0008\u0010/\u001a\u0004\u0018\u00010.\u00a2\u0006\u0004\u0008*\u00100J\u0010\u00101\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0010\u00105\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0010\u00107\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u0010\u00109\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010@J\u0010\u0010A\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u00102J\u0010\u0010B\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u00102J\u0012\u0010C\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008C\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008E\u0010DJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008F\u0010DJ\u0010\u0010G\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008G\u00108J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008H\u00102J\u0012\u0010I\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008I\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003\u00a2\u0006\u0004\u0008K\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008M\u0010@J\u0012\u0010N\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003\u00a2\u0006\u0004\u0008N\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010!H\u00c6\u0003\u00a2\u0006\u0004\u0008P\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008R\u0010@J\u0018\u0010S\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$H\u00c6\u0003\u00a2\u0006\u0004\u0008S\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010&H\u00c6\u0003\u00a2\u0006\u0004\u0008U\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0004\u0008W\u0010XJ\u00a8\u0002\u0010Y\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00022\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00082\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\u0010\u0008\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$2\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010&2\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010(H\u00c6\u0001\u00a2\u0006\u0004\u0008Y\u0010ZJ\u0010\u0010[\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008[\u00102J\u0010\u0010\\\u001a\u00020,H\u00d6\u0001\u00a2\u0006\u0004\u0008\\\u0010]J\u001a\u0010_\u001a\u00020\u00082\u0008\u0010^\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008_\u0010`J\'\u0010i\u001a\u00020f2\u0006\u0010a\u001a\u00020\u00002\u0006\u0010c\u001a\u00020b2\u0006\u0010e\u001a\u00020dH\u0001\u00a2\u0006\u0004\u0008g\u0010hR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010j\u0012\u0004\u0008l\u0010m\u001a\u0004\u0008k\u00102R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010n\u0012\u0004\u0008p\u0010m\u001a\u0004\u0008o\u00104R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010q\u0012\u0004\u0008s\u0010m\u001a\u0004\u0008r\u00106R \u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010t\u0012\u0004\u0008v\u0010m\u001a\u0004\u0008u\u00108R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010w\u0012\u0004\u0008y\u0010m\u001a\u0004\u0008x\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010z\u0012\u0004\u0008|\u0010m\u001a\u0004\u0008{\u0010<R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010}\u0012\u0004\u0008\u007f\u0010m\u001a\u0004\u0008~\u0010>R%\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0011\u0010\u0080\u0001\u0012\u0005\u0008\u0082\u0001\u0010m\u001a\u0005\u0008\u0081\u0001\u0010@R\"\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0012\u0010j\u0012\u0005\u0008\u0084\u0001\u0010m\u001a\u0005\u0008\u0083\u0001\u00102R\"\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0013\u0010j\u0012\u0005\u0008\u0086\u0001\u0010m\u001a\u0005\u0008\u0085\u0001\u00102R%\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0015\u0010\u0087\u0001\u0012\u0005\u0008\u0089\u0001\u0010m\u001a\u0005\u0008\u0088\u0001\u0010DR%\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0016\u0010\u0087\u0001\u0012\u0005\u0008\u008b\u0001\u0010m\u001a\u0005\u0008\u008a\u0001\u0010DR%\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0017\u0010\u0087\u0001\u0012\u0005\u0008\u008d\u0001\u0010m\u001a\u0005\u0008\u008c\u0001\u0010DR\"\u0010\u0018\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0018\u0010t\u0012\u0005\u0008\u008f\u0001\u0010m\u001a\u0005\u0008\u008e\u0001\u00108R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0019\u0010j\u0012\u0005\u0008\u0091\u0001\u0010m\u001a\u0005\u0008\u0090\u0001\u00102R%\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u001b\u0010\u0092\u0001\u0012\u0005\u0008\u0094\u0001\u0010m\u001a\u0005\u0008\u0093\u0001\u0010JR%\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u001d\u0010\u0095\u0001\u0012\u0005\u0008\u0097\u0001\u0010m\u001a\u0005\u0008\u0096\u0001\u0010LR%\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u001e\u0010\u0080\u0001\u0012\u0005\u0008\u0099\u0001\u0010m\u001a\u0005\u0008\u0098\u0001\u0010@R%\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008 \u0010\u009a\u0001\u0012\u0005\u0008\u009c\u0001\u0010m\u001a\u0005\u0008\u009b\u0001\u0010OR%\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\"\u0010\u009d\u0001\u0012\u0005\u0008\u009f\u0001\u0010m\u001a\u0005\u0008\u009e\u0001\u0010QR%\u0010#\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008#\u0010\u0080\u0001\u0012\u0005\u0008\u00a1\u0001\u0010m\u001a\u0005\u0008\u00a0\u0001\u0010@R+\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008%\u0010\u00a2\u0001\u0012\u0005\u0008\u00a4\u0001\u0010m\u001a\u0005\u0008\u00a3\u0001\u0010TR%\u0010\'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\'\u0010\u00a5\u0001\u0012\u0005\u0008\u00a7\u0001\u0010m\u001a\u0005\u0008\u00a6\u0001\u0010VR\u001b\u0010)\u001a\u0004\u0018\u00010(8\u0006\u00a2\u0006\u000e\n\u0005\u0008)\u0010\u00a8\u0001\u001a\u0005\u0008\u00a9\u0001\u0010X\u00a8\u0006\u00ad\u0001"
    }
    d2 = {
        "Lcom/whoop/stress/domain/model/StressMonitorDto;",
        "",
        "",
        "title",
        "Lcom/whoop/stress/domain/model/LoadingData;",
        "loadingData",
        "Lcom/whoop/design/models/items/graph/stress/StressState;",
        "stressState",
        "",
        "showConnectivityWindow",
        "Lcom/whoop/stress/domain/model/StressMonitorMeterDto;",
        "meter",
        "Lcom/whoop/stress/domain/model/StressMonitorVow;",
        "vow",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "whoopCoachVow",
        "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
        "stressGraph",
        "feedbackUrl",
        "lastUpdated",
        "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
        "onboardingCarouselModel",
        "sessionsCarouselModel",
        "educationCarouselModel",
        "showOnboardingEducation",
        "calibrationText",
        "Lcom/whoop/stress/domain/model/PendingActivityDialogue;",
        "pendingActivityDialogue",
        "Lcom/whoop/stress/domain/model/OnboardingDismissDialog;",
        "onboardingDismissDialogue",
        "previousStressGraphState",
        "Lcom/whoop/stress/domain/model/StressTrend;",
        "trend",
        "Lcom/whoop/stress/domain/model/StressDateSelector;",
        "dateSelector",
        "extended24HourGraphState",
        "",
        "trendList",
        "Lcom/whoop/design/models/items/StepperComponentModel;",
        "progressStepper",
        "Lcom/whoop/stress/domain/model/MetaData;",
        "metadata",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/stress/domain/model/LoadingData;",
        "component3",
        "()Lcom/whoop/design/models/items/graph/stress/StressState;",
        "component4",
        "()Z",
        "component5",
        "()Lcom/whoop/stress/domain/model/StressMonitorMeterDto;",
        "component6",
        "()Lcom/whoop/stress/domain/model/StressMonitorVow;",
        "component7",
        "()Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "component8",
        "()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
        "component9",
        "component10",
        "component11",
        "()Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "()Lcom/whoop/stress/domain/model/PendingActivityDialogue;",
        "component17",
        "()Lcom/whoop/stress/domain/model/OnboardingDismissDialog;",
        "component18",
        "component19",
        "()Lcom/whoop/stress/domain/model/StressTrend;",
        "component20",
        "()Lcom/whoop/stress/domain/model/StressDateSelector;",
        "component21",
        "component22",
        "()Ljava/util/List;",
        "component23",
        "()Lcom/whoop/design/models/items/StepperComponentModel;",
        "component24",
        "()Lcom/whoop/stress/domain/model/MetaData;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;)Lcom/whoop/stress/domain/model/StressMonitorDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$stress_release",
        "(Lcom/whoop/stress/domain/model/StressMonitorDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "Lcom/whoop/stress/domain/model/LoadingData;",
        "getLoadingData",
        "getLoadingData$annotations",
        "Lcom/whoop/design/models/items/graph/stress/StressState;",
        "getStressState",
        "getStressState$annotations",
        "Z",
        "getShowConnectivityWindow",
        "getShowConnectivityWindow$annotations",
        "Lcom/whoop/stress/domain/model/StressMonitorMeterDto;",
        "getMeter",
        "getMeter$annotations",
        "Lcom/whoop/stress/domain/model/StressMonitorVow;",
        "getVow",
        "getVow$annotations",
        "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
        "getWhoopCoachVow",
        "getWhoopCoachVow$annotations",
        "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
        "getStressGraph",
        "getStressGraph$annotations",
        "getFeedbackUrl",
        "getFeedbackUrl$annotations",
        "getLastUpdated",
        "getLastUpdated$annotations",
        "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
        "getOnboardingCarouselModel",
        "getOnboardingCarouselModel$annotations",
        "getSessionsCarouselModel",
        "getSessionsCarouselModel$annotations",
        "getEducationCarouselModel",
        "getEducationCarouselModel$annotations",
        "getShowOnboardingEducation",
        "getShowOnboardingEducation$annotations",
        "getCalibrationText",
        "getCalibrationText$annotations",
        "Lcom/whoop/stress/domain/model/PendingActivityDialogue;",
        "getPendingActivityDialogue",
        "getPendingActivityDialogue$annotations",
        "Lcom/whoop/stress/domain/model/OnboardingDismissDialog;",
        "getOnboardingDismissDialogue",
        "getOnboardingDismissDialogue$annotations",
        "getPreviousStressGraphState",
        "getPreviousStressGraphState$annotations",
        "Lcom/whoop/stress/domain/model/StressTrend;",
        "getTrend",
        "getTrend$annotations",
        "Lcom/whoop/stress/domain/model/StressDateSelector;",
        "getDateSelector",
        "getDateSelector$annotations",
        "getExtended24HourGraphState",
        "getExtended24HourGraphState$annotations",
        "Ljava/util/List;",
        "getTrendList",
        "getTrendList$annotations",
        "Lcom/whoop/design/models/items/StepperComponentModel;",
        "getProgressStepper",
        "getProgressStepper$annotations",
        "Lcom/whoop/stress/domain/model/MetaData;",
        "getMetadata",
        "Companion",
        "$serializer",
        "a",
        "stress_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/stress/domain/model/StressMonitorDto$a;


# instance fields
.field private final calibrationText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "calibration_text_display"
    .end annotation
.end field

.field private final dateSelector:Lcom/whoop/stress/domain/model/StressDateSelector;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "date_selector"
    .end annotation
.end field

.field private final educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "education_carousel"
    .end annotation
.end field

.field private final extended24HourGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "extended24_hour_graph"
    .end annotation
.end field

.field private final feedbackUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "typeform_url"
    .end annotation
.end field

.field private final lastUpdated:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "last_updated_display"
    .end annotation
.end field

.field private final loadingData:Lcom/whoop/stress/domain/model/LoadingData;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "loading_data"
    .end annotation
.end field

.field private final metadata:Lcom/whoop/stress/domain/model/MetaData;

.field private final meter:Lcom/whoop/stress/domain/model/StressMonitorMeterDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "gauge"
    .end annotation
.end field

.field private final onboardingCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "onboarding_carousel"
    .end annotation
.end field

.field private final onboardingDismissDialogue:Lcom/whoop/stress/domain/model/OnboardingDismissDialog;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "onboarding_dismiss_dialogue"
    .end annotation
.end field

.field private final pendingActivityDialogue:Lcom/whoop/stress/domain/model/PendingActivityDialogue;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "pending_activity_dialogue"
    .end annotation
.end field

.field private final previousStressGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "previous_stress_graph"
    .end annotation
.end field

.field private final progressStepper:Lcom/whoop/design/models/items/StepperComponentModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "progress_stepper"
    .end annotation
.end field

.field private final sessionsCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sessions"
    .end annotation
.end field

.field private final showConnectivityWindow:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "show_connectivity_window"
    .end annotation
.end field

.field private final showOnboardingEducation:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "show_education"
    .end annotation
.end field

.field private final stressGraph:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stress_graph"
    .end annotation
.end field

.field private final stressState:Lcom/whoop/design/models/items/graph/stress/StressState;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stress_state"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "title"
    .end annotation
.end field

.field private final trend:Lcom/whoop/stress/domain/model/StressTrend;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend"
    .end annotation
.end field

.field private final trendList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend_list"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrend;",
            ">;"
        }
    .end annotation
.end field

.field private final vow:Lcom/whoop/stress/domain/model/StressMonitorVow;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vow"
    .end annotation
.end field

.field private final whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "whoop_coach_vow"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/stress/domain/model/StressMonitorDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/stress/domain/model/StressMonitorDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->Companion:Lcom/whoop/stress/domain/model/StressMonitorDto$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lih1/b;

    const/16 v4, 0xd

    invoke-direct {v3, v4}, Lih1/b;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lih1/b;

    const/16 v6, 0xe

    invoke-direct {v5, v6}, Lih1/b;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x18

    new-array v5, v5, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    const/4 v7, 0x1

    aput-object v1, v5, v7

    const/4 v7, 0x2

    aput-object v3, v5, v7

    const/4 v3, 0x3

    aput-object v1, v5, v3

    const/4 v3, 0x4

    aput-object v1, v5, v3

    const/4 v3, 0x5

    aput-object v1, v5, v3

    const/4 v3, 0x6

    aput-object v1, v5, v3

    const/4 v3, 0x7

    aput-object v1, v5, v3

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    const/16 v0, 0xa

    aput-object v1, v5, v0

    const/16 v0, 0xb

    aput-object v1, v5, v0

    const/16 v0, 0xc

    aput-object v1, v5, v0

    aput-object v1, v5, v4

    aput-object v1, v5, v6

    const/16 v0, 0xf

    aput-object v1, v5, v0

    const/16 v0, 0x10

    aput-object v1, v5, v0

    const/16 v0, 0x11

    aput-object v1, v5, v0

    const/16 v0, 0x12

    aput-object v1, v5, v0

    const/16 v0, 0x13

    aput-object v1, v5, v0

    const/16 v0, 0x14

    aput-object v1, v5, v0

    const/16 v0, 0x15

    aput-object v2, v5, v0

    const/16 v0, 0x16

    aput-object v1, v5, v0

    const/16 v0, 0x17

    aput-object v1, v5, v0

    sput-object v5, Lcom/whoop/stress/domain/model/StressMonitorDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0xffffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/StressMonitorDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->loadingData:Lcom/whoop/stress/domain/model/LoadingData;

    iput-object p4, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressState:Lcom/whoop/design/models/items/graph/stress/StressState;

    iput-boolean p5, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showConnectivityWindow:Z

    iput-object p6, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->meter:Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    iput-object p7, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->vow:Lcom/whoop/stress/domain/model/StressMonitorVow;

    iput-object p8, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iput-object p9, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressGraph:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    iput-object p10, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->feedbackUrl:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->lastUpdated:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    iput-object p13, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->sessionsCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    move/from16 p1, p15

    iput-boolean p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showOnboardingEducation:Z

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->calibrationText:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->pendingActivityDialogue:Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingDismissDialogue:Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->previousStressGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trend:Lcom/whoop/stress/domain/model/StressTrend;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->dateSelector:Lcom/whoop/stress/domain/model/StressDateSelector;

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->extended24HourGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-object/from16 p1, p23

    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trendList:Ljava/util/List;

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->progressStepper:Lcom/whoop/design/models/items/StepperComponentModel;

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->metadata:Lcom/whoop/stress/domain/model/MetaData;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/model/LoadingData;",
            "Lcom/whoop/design/models/items/graph/stress/StressState;",
            "Z",
            "Lcom/whoop/stress/domain/model/StressMonitorMeterDto;",
            "Lcom/whoop/stress/domain/model/StressMonitorVow;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
            "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
            "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/model/PendingActivityDialogue;",
            "Lcom/whoop/stress/domain/model/OnboardingDismissDialog;",
            "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
            "Lcom/whoop/stress/domain/model/StressTrend;",
            "Lcom/whoop/stress/domain/model/StressDateSelector;",
            "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrend;",
            ">;",
            "Lcom/whoop/design/models/items/StepperComponentModel;",
            "Lcom/whoop/stress/domain/model/MetaData;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stressState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "meter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedbackUrl"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastUpdated"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->loadingData:Lcom/whoop/stress/domain/model/LoadingData;

    .line 5
    iput-object p3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressState:Lcom/whoop/design/models/items/graph/stress/StressState;

    .line 6
    iput-boolean p4, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showConnectivityWindow:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->meter:Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    .line 8
    iput-object p6, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->vow:Lcom/whoop/stress/domain/model/StressMonitorVow;

    .line 9
    iput-object p7, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    .line 10
    iput-object p8, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressGraph:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    .line 11
    iput-object p9, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->feedbackUrl:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->lastUpdated:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    .line 14
    iput-object p12, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->sessionsCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    .line 15
    iput-object p13, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    .line 16
    iput-boolean p14, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showOnboardingEducation:Z

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->calibrationText:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->pendingActivityDialogue:Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingDismissDialogue:Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->previousStressGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trend:Lcom/whoop/stress/domain/model/StressTrend;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->dateSelector:Lcom/whoop/stress/domain/model/StressDateSelector;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->extended24HourGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trendList:Ljava/util/List;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->progressStepper:Lcom/whoop/design/models/items/StepperComponentModel;

    move-object/from16 p1, p24

    .line 26
    iput-object p1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->metadata:Lcom/whoop/stress/domain/model/MetaData;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.graph.stress.StressState"

    invoke-static {}, Lcom/whoop/design/models/items/graph/stress/StressState;->values()[Lcom/whoop/design/models/items/graph/stress/StressState;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/stress/domain/model/StressTrend$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressTrend$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/stress/domain/model/StressMonitorDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/stress/domain/model/StressMonitorDto;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/stress/domain/model/StressMonitorDto;Ljava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;ILjava/lang/Object;)Lcom/whoop/stress/domain/model/StressMonitorDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p25

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->title:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->loadingData:Lcom/whoop/stress/domain/model/LoadingData;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressState:Lcom/whoop/design/models/items/graph/stress/StressState;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showConnectivityWindow:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->meter:Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->vow:Lcom/whoop/stress/domain/model/StressMonitorVow;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressGraph:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->feedbackUrl:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->lastUpdated:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->sessionsCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showOnboardingEducation:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->calibrationText:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->pendingActivityDialogue:Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p25, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingDismissDialogue:Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p25, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->previousStressGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p25, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trend:Lcom/whoop/stress/domain/model/StressTrend;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p25, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->dateSelector:Lcom/whoop/stress/domain/model/StressDateSelector;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p25, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->extended24HourGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p25, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trendList:Ljava/util/List;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p25, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->progressStepper:Lcom/whoop/design/models/items/StepperComponentModel;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p25, v16

    if-eqz v16, :cond_17

    move-object/from16 p9, v1

    iget-object v1, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->metadata:Lcom/whoop/stress/domain/model/MetaData;

    move-object/from16 p24, p9

    move-object/from16 p25, v1

    :goto_17
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_18

    :cond_17
    move-object/from16 p25, p24

    move-object/from16 p24, v1

    goto :goto_17

    :goto_18
    invoke-virtual/range {p1 .. p25}, Lcom/whoop/stress/domain/model/StressMonitorDto;->copy(Ljava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;)Lcom/whoop/stress/domain/model/StressMonitorDto;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getCalibrationText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "calibration_text_display"
    .end annotation

    return-void
.end method

.method public static synthetic getDateSelector$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "date_selector"
    .end annotation

    return-void
.end method

.method public static synthetic getEducationCarouselModel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "education_carousel"
    .end annotation

    return-void
.end method

.method public static synthetic getExtended24HourGraphState$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "extended24_hour_graph"
    .end annotation

    return-void
.end method

.method public static synthetic getFeedbackUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "typeform_url"
    .end annotation

    return-void
.end method

.method public static synthetic getLastUpdated$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "last_updated_display"
    .end annotation

    return-void
.end method

.method public static synthetic getLoadingData$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "loading_data"
    .end annotation

    return-void
.end method

.method public static synthetic getMeter$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "gauge"
    .end annotation

    return-void
.end method

.method public static synthetic getOnboardingCarouselModel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "onboarding_carousel"
    .end annotation

    return-void
.end method

.method public static synthetic getOnboardingDismissDialogue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "onboarding_dismiss_dialogue"
    .end annotation

    return-void
.end method

.method public static synthetic getPendingActivityDialogue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "pending_activity_dialogue"
    .end annotation

    return-void
.end method

.method public static synthetic getPreviousStressGraphState$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "previous_stress_graph"
    .end annotation

    return-void
.end method

.method public static synthetic getProgressStepper$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "progress_stepper"
    .end annotation

    return-void
.end method

.method public static synthetic getSessionsCarouselModel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "sessions"
    .end annotation

    return-void
.end method

.method public static synthetic getShowConnectivityWindow$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "show_connectivity_window"
    .end annotation

    return-void
.end method

.method public static synthetic getShowOnboardingEducation$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "show_education"
    .end annotation

    return-void
.end method

.method public static synthetic getStressGraph$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "stress_graph"
    .end annotation

    return-void
.end method

.method public static synthetic getStressState$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "stress_state"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title"
    .end annotation

    return-void
.end method

.method public static synthetic getTrend$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend"
    .end annotation

    return-void
.end method

.method public static synthetic getTrendList$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_list"
    .end annotation

    return-void
.end method

.method public static synthetic getVow$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "vow"
    .end annotation

    return-void
.end method

.method public static synthetic getWhoopCoachVow$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "whoop_coach_vow"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stress_release(Lcom/whoop/stress/domain/model/StressMonitorDto;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/stress/domain/model/LoadingData$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/LoadingData$$serializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->loadingData:Lcom/whoop/stress/domain/model/LoadingData;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressState:Lcom/whoop/design/models/items/graph/stress/StressState;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-boolean v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showConnectivityWindow:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v1, Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorMeterDto$$serializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->meter:Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/stress/domain/model/StressMonitorVow$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressMonitorVow$$serializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->vow:Lcom/whoop/stress/domain/model/StressMonitorVow;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/WhoopCoachVowModel$$serializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/graph/StressGraphingCardModel$$serializer;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressGraph:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    const/4 v3, 0x7

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->feedbackUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->lastUpdated:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v2, Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    const/16 v4, 0xa

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0xb

    iget-object v4, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->sessionsCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0xc

    iget-object v4, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xd

    iget-boolean v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showOnboardingEducation:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->calibrationText:Ljava/lang/String;

    const/16 v4, 0xe

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/stress/domain/model/PendingActivityDialogue$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/PendingActivityDialogue$$serializer;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->pendingActivityDialogue:Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    const/16 v4, 0xf

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/stress/domain/model/OnboardingDismissDialog$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/OnboardingDismissDialog$$serializer;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingDismissDialogue:Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    const/16 v4, 0x10

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x11

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->previousStressGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/stress/domain/model/StressTrend$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressTrend$$serializer;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trend:Lcom/whoop/stress/domain/model/StressTrend;

    const/16 v4, 0x12

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/stress/domain/model/StressDateSelector$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/StressDateSelector$$serializer;

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->dateSelector:Lcom/whoop/stress/domain/model/StressDateSelector;

    const/16 v4, 0x13

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x14

    iget-object v3, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->extended24HourGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x15

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trendList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/design/models/items/StepperComponentModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/StepperComponentModel$$serializer;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->progressStepper:Lcom/whoop/design/models/items/StepperComponentModel;

    const/16 v2, 0x16

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/stress/domain/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/stress/domain/model/MetaData$$serializer;

    iget-object p0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->metadata:Lcom/whoop/stress/domain/model/MetaData;

    const/16 v1, 0x17

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->lastUpdated:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->sessionsCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    return-object v0
.end method

.method public final component13()Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    return-object v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showOnboardingEducation:Z

    return v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->calibrationText:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Lcom/whoop/stress/domain/model/PendingActivityDialogue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->pendingActivityDialogue:Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    return-object v0
.end method

.method public final component17()Lcom/whoop/stress/domain/model/OnboardingDismissDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingDismissDialogue:Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    return-object v0
.end method

.method public final component18()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->previousStressGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    return-object v0
.end method

.method public final component19()Lcom/whoop/stress/domain/model/StressTrend;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trend:Lcom/whoop/stress/domain/model/StressTrend;

    return-object v0
.end method

.method public final component2()Lcom/whoop/stress/domain/model/LoadingData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->loadingData:Lcom/whoop/stress/domain/model/LoadingData;

    return-object v0
.end method

.method public final component20()Lcom/whoop/stress/domain/model/StressDateSelector;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->dateSelector:Lcom/whoop/stress/domain/model/StressDateSelector;

    return-object v0
.end method

.method public final component21()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->extended24HourGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    return-object v0
.end method

.method public final component22()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrend;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trendList:Ljava/util/List;

    return-object v0
.end method

.method public final component23()Lcom/whoop/design/models/items/StepperComponentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->progressStepper:Lcom/whoop/design/models/items/StepperComponentModel;

    return-object v0
.end method

.method public final component24()Lcom/whoop/stress/domain/model/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->metadata:Lcom/whoop/stress/domain/model/MetaData;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/graph/stress/StressState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressState:Lcom/whoop/design/models/items/graph/stress/StressState;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showConnectivityWindow:Z

    return v0
.end method

.method public final component5()Lcom/whoop/stress/domain/model/StressMonitorMeterDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->meter:Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    return-object v0
.end method

.method public final component6()Lcom/whoop/stress/domain/model/StressMonitorVow;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->vow:Lcom/whoop/stress/domain/model/StressMonitorVow;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressGraph:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->feedbackUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;)Lcom/whoop/stress/domain/model/StressMonitorDto;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/model/LoadingData;",
            "Lcom/whoop/design/models/items/graph/stress/StressState;",
            "Z",
            "Lcom/whoop/stress/domain/model/StressMonitorMeterDto;",
            "Lcom/whoop/stress/domain/model/StressMonitorVow;",
            "Lcom/whoop/design/models/items/WhoopCoachVowModel;",
            "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
            "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
            "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/whoop/stress/domain/model/PendingActivityDialogue;",
            "Lcom/whoop/stress/domain/model/OnboardingDismissDialog;",
            "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
            "Lcom/whoop/stress/domain/model/StressTrend;",
            "Lcom/whoop/stress/domain/model/StressDateSelector;",
            "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrend;",
            ">;",
            "Lcom/whoop/design/models/items/StepperComponentModel;",
            "Lcom/whoop/stress/domain/model/MetaData;",
            ")",
            "Lcom/whoop/stress/domain/model/StressMonitorDto;"
        }
    .end annotation

    const-string v0, "title"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stressState"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "meter"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "feedbackUrl"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastUpdated"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/stress/domain/model/StressMonitorDto;

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    invoke-direct/range {v1 .. v25}, Lcom/whoop/stress/domain/model/StressMonitorDto;-><init>(Ljava/lang/String;Lcom/whoop/stress/domain/model/LoadingData;Lcom/whoop/design/models/items/graph/stress/StressState;ZLcom/whoop/stress/domain/model/StressMonitorMeterDto;Lcom/whoop/stress/domain/model/StressMonitorVow;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/stress/domain/model/StressMonitorDto;

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->loadingData:Lcom/whoop/stress/domain/model/LoadingData;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->loadingData:Lcom/whoop/stress/domain/model/LoadingData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressState:Lcom/whoop/design/models/items/graph/stress/StressState;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressState:Lcom/whoop/design/models/items/graph/stress/StressState;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showConnectivityWindow:Z

    iget-boolean v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->showConnectivityWindow:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->meter:Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->meter:Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->vow:Lcom/whoop/stress/domain/model/StressMonitorVow;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->vow:Lcom/whoop/stress/domain/model/StressMonitorVow;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressGraph:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressGraph:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->feedbackUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->feedbackUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->lastUpdated:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->lastUpdated:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->sessionsCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->sessionsCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showOnboardingEducation:Z

    iget-boolean v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->showOnboardingEducation:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->calibrationText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->calibrationText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->pendingActivityDialogue:Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->pendingActivityDialogue:Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingDismissDialogue:Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingDismissDialogue:Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->previousStressGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->previousStressGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trend:Lcom/whoop/stress/domain/model/StressTrend;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->trend:Lcom/whoop/stress/domain/model/StressTrend;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->dateSelector:Lcom/whoop/stress/domain/model/StressDateSelector;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->dateSelector:Lcom/whoop/stress/domain/model/StressDateSelector;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->extended24HourGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->extended24HourGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trendList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->trendList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->progressStepper:Lcom/whoop/design/models/items/StepperComponentModel;

    iget-object v3, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->progressStepper:Lcom/whoop/design/models/items/StepperComponentModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->metadata:Lcom/whoop/stress/domain/model/MetaData;

    iget-object p1, p1, Lcom/whoop/stress/domain/model/StressMonitorDto;->metadata:Lcom/whoop/stress/domain/model/MetaData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    return v2

    :cond_19
    return v0
.end method

.method public final getCalibrationText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->calibrationText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDateSelector()Lcom/whoop/stress/domain/model/StressDateSelector;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->dateSelector:Lcom/whoop/stress/domain/model/StressDateSelector;

    return-object v0
.end method

.method public final getEducationCarouselModel()Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    return-object v0
.end method

.method public final getExtended24HourGraphState()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->extended24HourGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    return-object v0
.end method

.method public final getFeedbackUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->feedbackUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastUpdated()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->lastUpdated:Ljava/lang/String;

    return-object v0
.end method

.method public final getLoadingData()Lcom/whoop/stress/domain/model/LoadingData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->loadingData:Lcom/whoop/stress/domain/model/LoadingData;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/stress/domain/model/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->metadata:Lcom/whoop/stress/domain/model/MetaData;

    return-object v0
.end method

.method public final getMeter()Lcom/whoop/stress/domain/model/StressMonitorMeterDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->meter:Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    return-object v0
.end method

.method public final getOnboardingCarouselModel()Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    return-object v0
.end method

.method public final getOnboardingDismissDialogue()Lcom/whoop/stress/domain/model/OnboardingDismissDialog;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingDismissDialogue:Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    return-object v0
.end method

.method public final getPendingActivityDialogue()Lcom/whoop/stress/domain/model/PendingActivityDialogue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->pendingActivityDialogue:Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    return-object v0
.end method

.method public final getPreviousStressGraphState()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->previousStressGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    return-object v0
.end method

.method public final getProgressStepper()Lcom/whoop/design/models/items/StepperComponentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->progressStepper:Lcom/whoop/design/models/items/StepperComponentModel;

    return-object v0
.end method

.method public final getSessionsCarouselModel()Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->sessionsCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    return-object v0
.end method

.method public final getShowConnectivityWindow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showConnectivityWindow:Z

    return v0
.end method

.method public final getShowOnboardingEducation()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showOnboardingEducation:Z

    return v0
.end method

.method public final getStressGraph()Lcom/whoop/design/models/items/graph/StressGraphingCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressGraph:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    return-object v0
.end method

.method public final getStressState()Lcom/whoop/design/models/items/graph/stress/StressState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressState:Lcom/whoop/design/models/items/graph/stress/StressState;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrend()Lcom/whoop/stress/domain/model/StressTrend;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trend:Lcom/whoop/stress/domain/model/StressTrend;

    return-object v0
.end method

.method public final getTrendList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/model/StressTrend;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trendList:Ljava/util/List;

    return-object v0
.end method

.method public final getVow()Lcom/whoop/stress/domain/model/StressMonitorVow;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->vow:Lcom/whoop/stress/domain/model/StressMonitorVow;

    return-object v0
.end method

.method public final getWhoopCoachVow()Lcom/whoop/design/models/items/WhoopCoachVowModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->loadingData:Lcom/whoop/stress/domain/model/LoadingData;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/LoadingData;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressState:Lcom/whoop/design/models/items/graph/stress/StressState;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showConnectivityWindow:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->meter:Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/StressMonitorMeterDto;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->vow:Lcom/whoop/stress/domain/model/StressMonitorVow;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/stress/domain/model/StressMonitorVow;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lcom/whoop/design/models/items/WhoopCoachVowModel;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressGraph:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->feedbackUrl:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->lastUpdated:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ArticleTileCarouselModel;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->sessionsCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ArticleTileCarouselModel;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ArticleTileCarouselModel;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showOnboardingEducation:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->calibrationText:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->pendingActivityDialogue:Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/PendingActivityDialogue;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingDismissDialogue:Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/OnboardingDismissDialog;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->previousStressGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trend:Lcom/whoop/stress/domain/model/StressTrend;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/StressTrend;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->dateSelector:Lcom/whoop/stress/domain/model/StressDateSelector;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Lcom/whoop/stress/domain/model/StressDateSelector;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->extended24HourGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/StressGraphingCardModel;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trendList:Ljava/util/List;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->progressStepper:Lcom/whoop/design/models/items/StepperComponentModel;

    if-nez v2, :cond_f

    move v2, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Lcom/whoop/design/models/items/StepperComponentModel;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/stress/domain/model/StressMonitorDto;->metadata:Lcom/whoop/stress/domain/model/MetaData;

    if-nez v1, :cond_10

    goto :goto_10

    :cond_10
    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/MetaData;->hashCode()I

    move-result v3

    :goto_10
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->title:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->loadingData:Lcom/whoop/stress/domain/model/LoadingData;

    iget-object v3, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressState:Lcom/whoop/design/models/items/graph/stress/StressState;

    iget-boolean v4, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showConnectivityWindow:Z

    iget-object v5, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->meter:Lcom/whoop/stress/domain/model/StressMonitorMeterDto;

    iget-object v6, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->vow:Lcom/whoop/stress/domain/model/StressMonitorVow;

    iget-object v7, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->whoopCoachVow:Lcom/whoop/design/models/items/WhoopCoachVowModel;

    iget-object v8, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->stressGraph:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    iget-object v9, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->feedbackUrl:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->lastUpdated:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    iget-object v12, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->sessionsCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    iget-object v13, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    iget-boolean v14, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->showOnboardingEducation:Z

    iget-object v15, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->calibrationText:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->pendingActivityDialogue:Lcom/whoop/stress/domain/model/PendingActivityDialogue;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->onboardingDismissDialogue:Lcom/whoop/stress/domain/model/OnboardingDismissDialog;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->previousStressGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trend:Lcom/whoop/stress/domain/model/StressTrend;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->dateSelector:Lcom/whoop/stress/domain/model/StressDateSelector;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->extended24HourGraphState:Lcom/whoop/design/models/items/graph/StressGraphingCardModel;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->trendList:Ljava/util/List;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->progressStepper:Lcom/whoop/design/models/items/StepperComponentModel;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/whoop/stress/domain/model/StressMonitorDto;->metadata:Lcom/whoop/stress/domain/model/MetaData;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v25, v15

    const-string v15, "StressMonitorDto(title="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", loadingData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stressState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showConnectivityWindow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", meter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", vow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", whoopCoachVow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stressGraph="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", feedbackUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lastUpdated="

    const-string v2, ", onboardingCarouselModel="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sessionsCarouselModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", educationCarouselModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showOnboardingEducation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", calibrationText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pendingActivityDialogue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onboardingDismissDialogue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", previousStressGraphState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dateSelector="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extended24HourGraphState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trendList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", progressStepper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
