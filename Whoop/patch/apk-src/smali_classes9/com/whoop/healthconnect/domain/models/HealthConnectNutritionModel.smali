.class public final Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;,
        Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008+\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008=\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008<\u0008\u0087\u0008\u0018\u0000 \u00bc\u00012\u00020\u0001:\u0004\u00bd\u0001\u00bc\u0001B\u00f1\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u00100\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u00101\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u00102\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00104\u001a\u000203\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00107\u001a\u00020\u0002\u00a2\u0006\u0004\u00088\u00109B\u0095\u0004\u0008\u0010\u0012\u0006\u0010:\u001a\u000203\u0012\u0006\u0010;\u001a\u000203\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u00100\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u00101\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u00102\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00104\u001a\u000203\u0012\u0008\u00106\u001a\u0004\u0018\u000105\u0012\u0008\u00107\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010=\u001a\u0004\u0018\u00010<\u00a2\u0006\u0004\u00088\u0010>J\u0010\u0010?\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u0010@J\u0010\u0010B\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010@J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008C\u0010@J\u0012\u0010D\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008F\u0010EJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008G\u0010EJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008H\u0010EJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008I\u0010EJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008J\u0010EJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008K\u0010EJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008L\u0010EJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008M\u0010EJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008N\u0010EJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008O\u0010EJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008P\u0010EJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008Q\u0010EJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008R\u0010EJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008S\u0010EJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008T\u0010EJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008U\u0010EJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008V\u0010EJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008W\u0010EJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008X\u0010EJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008Y\u0010EJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008Z\u0010EJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008[\u0010EJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\\\u0010EJ\u0012\u0010]\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008]\u0010EJ\u0012\u0010^\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008^\u0010EJ\u0012\u0010_\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008_\u0010EJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008`\u0010EJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008a\u0010EJ\u0012\u0010b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008b\u0010EJ\u0012\u0010c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008c\u0010EJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008d\u0010EJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008e\u0010EJ\u0012\u0010f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008f\u0010EJ\u0012\u0010g\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008g\u0010EJ\u0012\u0010h\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008h\u0010EJ\u0012\u0010i\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008i\u0010EJ\u0012\u0010j\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008j\u0010EJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008k\u0010EJ\u0012\u0010l\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008l\u0010EJ\u0012\u0010m\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008m\u0010EJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008n\u0010EJ\u0012\u0010o\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008o\u0010@J\u0010\u0010p\u001a\u000203H\u00c6\u0003\u00a2\u0006\u0004\u0008p\u0010qJ\u0010\u0010r\u001a\u000205H\u00c6\u0003\u00a2\u0006\u0004\u0008r\u0010sJ\u0010\u0010t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008t\u0010@J\u00de\u0004\u0010u\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u00104\u001a\u0002032\u0008\u0008\u0002\u00106\u001a\u0002052\u0008\u0008\u0002\u00107\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008u\u0010vJ\u0010\u0010w\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008w\u0010@J\u0010\u0010x\u001a\u000203H\u00d6\u0001\u00a2\u0006\u0004\u0008x\u0010qJ\u001a\u0010{\u001a\u00020z2\u0008\u0010y\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008{\u0010|J-\u0010\u0085\u0001\u001a\u00030\u0082\u00012\u0006\u0010}\u001a\u00020\u00002\u0006\u0010\u007f\u001a\u00020~2\u0008\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0001\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0003\u0010\u0086\u0001\u001a\u0005\u0008\u0087\u0001\u0010@R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0004\u0010\u0086\u0001\u001a\u0005\u0008\u0088\u0001\u0010@R\u001c\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0005\u0010\u0086\u0001\u001a\u0005\u0008\u0089\u0001\u0010@R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0006\u0010\u0086\u0001\u001a\u0005\u0008\u008a\u0001\u0010@R\u001e\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0008\u0010\u008b\u0001\u001a\u0005\u0008\u008c\u0001\u0010ER\u001e\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\t\u0010\u008b\u0001\u001a\u0005\u0008\u008d\u0001\u0010ER\u001e\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\n\u0010\u008b\u0001\u001a\u0005\u0008\u008e\u0001\u0010ER\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u000b\u0010\u008b\u0001\u001a\u0005\u0008\u008f\u0001\u0010ER\u001e\u0010\u000c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u000c\u0010\u008b\u0001\u001a\u0005\u0008\u0090\u0001\u0010ER\u001e\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\r\u0010\u008b\u0001\u001a\u0005\u0008\u0091\u0001\u0010ER\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u000e\u0010\u008b\u0001\u001a\u0005\u0008\u0092\u0001\u0010ER\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u000f\u0010\u008b\u0001\u001a\u0005\u0008\u0093\u0001\u0010ER\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0010\u0010\u008b\u0001\u001a\u0005\u0008\u0094\u0001\u0010ER\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0011\u0010\u008b\u0001\u001a\u0005\u0008\u0095\u0001\u0010ER\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0012\u0010\u008b\u0001\u001a\u0005\u0008\u0096\u0001\u0010ER\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0013\u0010\u008b\u0001\u001a\u0005\u0008\u0097\u0001\u0010ER\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0014\u0010\u008b\u0001\u001a\u0005\u0008\u0098\u0001\u0010ER\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0015\u0010\u008b\u0001\u001a\u0005\u0008\u0099\u0001\u0010ER\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0016\u0010\u008b\u0001\u001a\u0005\u0008\u009a\u0001\u0010ER\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0017\u0010\u008b\u0001\u001a\u0005\u0008\u009b\u0001\u0010ER\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0018\u0010\u008b\u0001\u001a\u0005\u0008\u009c\u0001\u0010ER\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u0019\u0010\u008b\u0001\u001a\u0005\u0008\u009d\u0001\u0010ER\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u001a\u0010\u008b\u0001\u001a\u0005\u0008\u009e\u0001\u0010ER\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u001b\u0010\u008b\u0001\u001a\u0005\u0008\u009f\u0001\u0010ER\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u001c\u0010\u008b\u0001\u001a\u0005\u0008\u00a0\u0001\u0010ER\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u001d\u0010\u008b\u0001\u001a\u0005\u0008\u00a1\u0001\u0010ER\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u001e\u0010\u008b\u0001\u001a\u0005\u0008\u00a2\u0001\u0010ER\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\u001f\u0010\u008b\u0001\u001a\u0005\u0008\u00a3\u0001\u0010ER\u001e\u0010 \u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008 \u0010\u008b\u0001\u001a\u0005\u0008\u00a4\u0001\u0010ER\u001e\u0010!\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008!\u0010\u008b\u0001\u001a\u0005\u0008\u00a5\u0001\u0010ER\u001e\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\"\u0010\u008b\u0001\u001a\u0005\u0008\u00a6\u0001\u0010ER\u001e\u0010#\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008#\u0010\u008b\u0001\u001a\u0005\u0008\u00a7\u0001\u0010ER\u001e\u0010$\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008$\u0010\u008b\u0001\u001a\u0005\u0008\u00a8\u0001\u0010ER\u001e\u0010%\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008%\u0010\u008b\u0001\u001a\u0005\u0008\u00a9\u0001\u0010ER\u001e\u0010&\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008&\u0010\u008b\u0001\u001a\u0005\u0008\u00aa\u0001\u0010ER\u001e\u0010\'\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008\'\u0010\u008b\u0001\u001a\u0005\u0008\u00ab\u0001\u0010ER\u001e\u0010(\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008(\u0010\u008b\u0001\u001a\u0005\u0008\u00ac\u0001\u0010ER\u001e\u0010)\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008)\u0010\u008b\u0001\u001a\u0005\u0008\u00ad\u0001\u0010ER\u001e\u0010*\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008*\u0010\u008b\u0001\u001a\u0005\u0008\u00ae\u0001\u0010ER\u001e\u0010+\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008+\u0010\u008b\u0001\u001a\u0005\u0008\u00af\u0001\u0010ER\u001e\u0010,\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008,\u0010\u008b\u0001\u001a\u0005\u0008\u00b0\u0001\u0010ER\u001e\u0010-\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008-\u0010\u008b\u0001\u001a\u0005\u0008\u00b1\u0001\u0010ER\u001e\u0010.\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008.\u0010\u008b\u0001\u001a\u0005\u0008\u00b2\u0001\u0010ER\u001e\u0010/\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008/\u0010\u008b\u0001\u001a\u0005\u0008\u00b3\u0001\u0010ER\u001e\u00100\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u00080\u0010\u008b\u0001\u001a\u0005\u0008\u00b4\u0001\u0010ER\u001e\u00101\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u00081\u0010\u008b\u0001\u001a\u0005\u0008\u00b5\u0001\u0010ER\u001e\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u00082\u0010\u0086\u0001\u001a\u0005\u0008\u00b6\u0001\u0010@R\u001c\u00104\u001a\u0002038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u00084\u0010\u00b7\u0001\u001a\u0005\u0008\u00b8\u0001\u0010qR\u001c\u00106\u001a\u0002058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u00086\u0010\u00b9\u0001\u001a\u0005\u0008\u00ba\u0001\u0010sR\u001c\u00107\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u00087\u0010\u0086\u0001\u001a\u0005\u0008\u00bb\u0001\u0010@\u00a8\u0006\u00be\u0001"
    }
    d2 = {
        "Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;",
        "",
        "",
        "startTime",
        "startZoneOffset",
        "endTime",
        "endZoneOffset",
        "",
        "biotin",
        "caffeine",
        "calcium",
        "energy",
        "energyFromFat",
        "chloride",
        "cholesterol",
        "chromium",
        "copper",
        "dietaryFiber",
        "folate",
        "folicAcid",
        "iodine",
        "iron",
        "magnesium",
        "manganese",
        "molybdenum",
        "monounsaturatedFat",
        "niacin",
        "pantothenicAcid",
        "phosphorus",
        "polyunsaturatedFat",
        "potassium",
        "protein",
        "riboflavin",
        "saturatedFat",
        "selenium",
        "sodium",
        "sugar",
        "thiamin",
        "totalCarbohydrate",
        "totalFat",
        "transFat",
        "unsaturatedFat",
        "vitaminA",
        "vitaminB12",
        "vitaminB6",
        "vitaminC",
        "vitaminD",
        "vitaminE",
        "vitaminK",
        "zinc",
        "name",
        "",
        "mealType",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "metadata",
        "deviceZoneId",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V",
        "seen0",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/Double;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "component29",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component38",
        "component39",
        "component40",
        "component41",
        "component42",
        "component43",
        "component44",
        "component45",
        "component46",
        "component47",
        "component48",
        "()I",
        "component49",
        "()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "component50",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_connect_release",
        "(Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getStartTime",
        "getStartZoneOffset",
        "getEndTime",
        "getEndZoneOffset",
        "Ljava/lang/Double;",
        "getBiotin",
        "getCaffeine",
        "getCalcium",
        "getEnergy",
        "getEnergyFromFat",
        "getChloride",
        "getCholesterol",
        "getChromium",
        "getCopper",
        "getDietaryFiber",
        "getFolate",
        "getFolicAcid",
        "getIodine",
        "getIron",
        "getMagnesium",
        "getManganese",
        "getMolybdenum",
        "getMonounsaturatedFat",
        "getNiacin",
        "getPantothenicAcid",
        "getPhosphorus",
        "getPolyunsaturatedFat",
        "getPotassium",
        "getProtein",
        "getRiboflavin",
        "getSaturatedFat",
        "getSelenium",
        "getSodium",
        "getSugar",
        "getThiamin",
        "getTotalCarbohydrate",
        "getTotalFat",
        "getTransFat",
        "getUnsaturatedFat",
        "getVitaminA",
        "getVitaminB12",
        "getVitaminB6",
        "getVitaminC",
        "getVitaminD",
        "getVitaminE",
        "getVitaminK",
        "getZinc",
        "getName",
        "I",
        "getMealType",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "getMetadata",
        "getDeviceZoneId",
        "Companion",
        "$serializer",
        "health-connect_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$Companion;


# instance fields
.field private final biotin:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "biotin_milligrams"
    .end annotation
.end field

.field private final caffeine:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "caffeine_milligrams"
    .end annotation
.end field

.field private final calcium:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "calcium_milligrams"
    .end annotation
.end field

.field private final chloride:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "chloride_milligrams"
    .end annotation
.end field

.field private final cholesterol:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cholesterol_milligrams"
    .end annotation
.end field

.field private final chromium:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "chromium_milligrams"
    .end annotation
.end field

.field private final copper:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "copper_milligrams"
    .end annotation
.end field

.field private final deviceZoneId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "device_zone_id"
    .end annotation
.end field

.field private final dietaryFiber:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "dietary_fiber_milligrams"
    .end annotation
.end field

.field private final endTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "end_time"
    .end annotation
.end field

.field private final endZoneOffset:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "end_zone_offset"
    .end annotation
.end field

.field private final energy:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "energy_kilojoules"
    .end annotation
.end field

.field private final energyFromFat:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "energy_from_fat_kilojoules"
    .end annotation
.end field

.field private final folate:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "folate_milligrams"
    .end annotation
.end field

.field private final folicAcid:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "folic_acid_milligrams"
    .end annotation
.end field

.field private final iodine:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "iodine_milligrams"
    .end annotation
.end field

.field private final iron:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "iron_milligrams"
    .end annotation
.end field

.field private final magnesium:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "magnesium_milligrams"
    .end annotation
.end field

.field private final manganese:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "manganese_milligrams"
    .end annotation
.end field

.field private final mealType:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "meal_type"
    .end annotation
.end field

.field private final metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metadata"
    .end annotation
.end field

.field private final molybdenum:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "molybdenum_milligrams"
    .end annotation
.end field

.field private final monounsaturatedFat:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "monounsaturated_fat_milligrams"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final niacin:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "niacin_milligrams"
    .end annotation
.end field

.field private final pantothenicAcid:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "pantothenic_acid_milligrams"
    .end annotation
.end field

.field private final phosphorus:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "phosphorus_milligrams"
    .end annotation
.end field

.field private final polyunsaturatedFat:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "polyunsaturated_fat_milligrams"
    .end annotation
.end field

.field private final potassium:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "potassium_milligrams"
    .end annotation
.end field

.field private final protein:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "protein_milligrams"
    .end annotation
.end field

.field private final riboflavin:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "riboflavin_milligrams"
    .end annotation
.end field

.field private final saturatedFat:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "saturated_fat_milligrams"
    .end annotation
.end field

.field private final selenium:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "selenium_milligrams"
    .end annotation
.end field

.field private final sodium:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sodium_milligrams"
    .end annotation
.end field

.field private final startTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "start_time"
    .end annotation
.end field

.field private final startZoneOffset:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "start_zone_offset"
    .end annotation
.end field

.field private final sugar:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sugar_milligrams"
    .end annotation
.end field

.field private final thiamin:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "thiamin_milligrams"
    .end annotation
.end field

.field private final totalCarbohydrate:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_carbohydrate_milligrams"
    .end annotation
.end field

.field private final totalFat:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total_fat_milligrams"
    .end annotation
.end field

.field private final transFat:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trans_fat_milligrams"
    .end annotation
.end field

.field private final unsaturatedFat:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "unsaturated_fat_milligrams"
    .end annotation
.end field

.field private final vitaminA:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vitamin_a_milligrams"
    .end annotation
.end field

.field private final vitaminB12:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vitamin_b12_milligrams"
    .end annotation
.end field

.field private final vitaminB6:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vitamin_b6_milligrams"
    .end annotation
.end field

.field private final vitaminC:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vitamin_c_milligrams"
    .end annotation
.end field

.field private final vitaminD:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vitamin_d_milligrams"
    .end annotation
.end field

.field private final vitaminE:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vitamin_e_milligrams"
    .end annotation
.end field

.field private final vitaminK:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vitamin_k_milligrams"
    .end annotation
.end field

.field private final zinc:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "zinc_milligrams"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq v2, p1, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v0

    :goto_0
    const v4, 0x3ffff

    and-int v5, p2, v4

    if-eq v4, v5, :cond_1

    move v0, v1

    :cond_1
    or-int/2addr v0, v3

    if-eqz v0, :cond_2

    .line 1
    filled-new-array/range {p1 .. p2}, [I

    move-result-object p1

    filled-new-array {v2, v4}, [I

    move-result-object p2

    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwArrayMissingFieldException([I[ILyc3/g;)V

    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startTime:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startZoneOffset:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endTime:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endZoneOffset:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->biotin:Ljava/lang/Double;

    iput-object p8, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->caffeine:Ljava/lang/Double;

    iput-object p9, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->calcium:Ljava/lang/Double;

    move-object/from16 p1, p10

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energy:Ljava/lang/Double;

    move-object/from16 p1, p11

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energyFromFat:Ljava/lang/Double;

    move-object/from16 p1, p12

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chloride:Ljava/lang/Double;

    move-object/from16 p1, p13

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->cholesterol:Ljava/lang/Double;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chromium:Ljava/lang/Double;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->copper:Ljava/lang/Double;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->dietaryFiber:Ljava/lang/Double;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folate:Ljava/lang/Double;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folicAcid:Ljava/lang/Double;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iodine:Ljava/lang/Double;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iron:Ljava/lang/Double;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->magnesium:Ljava/lang/Double;

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->manganese:Ljava/lang/Double;

    move-object/from16 p1, p23

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->molybdenum:Ljava/lang/Double;

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->monounsaturatedFat:Ljava/lang/Double;

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->niacin:Ljava/lang/Double;

    move-object/from16 p1, p26

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->pantothenicAcid:Ljava/lang/Double;

    move-object/from16 p1, p27

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->phosphorus:Ljava/lang/Double;

    move-object/from16 p1, p28

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->polyunsaturatedFat:Ljava/lang/Double;

    move-object/from16 p1, p29

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->potassium:Ljava/lang/Double;

    move-object/from16 p1, p30

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->protein:Ljava/lang/Double;

    move-object/from16 p1, p31

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->riboflavin:Ljava/lang/Double;

    move-object/from16 p1, p32

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->saturatedFat:Ljava/lang/Double;

    move-object/from16 p1, p33

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->selenium:Ljava/lang/Double;

    move-object/from16 p1, p34

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sodium:Ljava/lang/Double;

    move-object/from16 p1, p35

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sugar:Ljava/lang/Double;

    move-object/from16 p1, p36

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->thiamin:Ljava/lang/Double;

    move-object/from16 p1, p37

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalCarbohydrate:Ljava/lang/Double;

    move-object/from16 p1, p38

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalFat:Ljava/lang/Double;

    move-object/from16 p1, p39

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->transFat:Ljava/lang/Double;

    move-object/from16 p1, p40

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->unsaturatedFat:Ljava/lang/Double;

    move-object/from16 p1, p41

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminA:Ljava/lang/Double;

    move-object/from16 p1, p42

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB12:Ljava/lang/Double;

    move-object/from16 p1, p43

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB6:Ljava/lang/Double;

    move-object/from16 p1, p44

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminC:Ljava/lang/Double;

    move-object/from16 p1, p45

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminD:Ljava/lang/Double;

    move-object/from16 p1, p46

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminE:Ljava/lang/Double;

    move-object/from16 p1, p47

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminK:Ljava/lang/Double;

    move-object/from16 p1, p48

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->zinc:Ljava/lang/Double;

    move-object/from16 p1, p49

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->name:Ljava/lang/String;

    move/from16 p1, p50

    iput p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->mealType:I

    move-object/from16 p1, p51

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    move-object/from16 p1, p52

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->deviceZoneId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V
    .locals 3

    move-object/from16 v0, p49

    move-object/from16 v1, p50

    const-string v2, "startTime"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "endTime"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "metadata"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "deviceZoneId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startTime:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startZoneOffset:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endTime:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endZoneOffset:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->biotin:Ljava/lang/Double;

    .line 8
    iput-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->caffeine:Ljava/lang/Double;

    .line 9
    iput-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->calcium:Ljava/lang/Double;

    .line 10
    iput-object p8, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energy:Ljava/lang/Double;

    .line 11
    iput-object p9, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energyFromFat:Ljava/lang/Double;

    .line 12
    iput-object p10, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chloride:Ljava/lang/Double;

    .line 13
    iput-object p11, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->cholesterol:Ljava/lang/Double;

    .line 14
    iput-object p12, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chromium:Ljava/lang/Double;

    move-object/from16 p1, p13

    .line 15
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->copper:Ljava/lang/Double;

    move-object/from16 p1, p14

    .line 16
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->dietaryFiber:Ljava/lang/Double;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folate:Ljava/lang/Double;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folicAcid:Ljava/lang/Double;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iodine:Ljava/lang/Double;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iron:Ljava/lang/Double;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->magnesium:Ljava/lang/Double;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->manganese:Ljava/lang/Double;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->molybdenum:Ljava/lang/Double;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->monounsaturatedFat:Ljava/lang/Double;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->niacin:Ljava/lang/Double;

    move-object/from16 p1, p24

    .line 26
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->pantothenicAcid:Ljava/lang/Double;

    move-object/from16 p1, p25

    .line 27
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->phosphorus:Ljava/lang/Double;

    move-object/from16 p1, p26

    .line 28
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->polyunsaturatedFat:Ljava/lang/Double;

    move-object/from16 p1, p27

    .line 29
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->potassium:Ljava/lang/Double;

    move-object/from16 p1, p28

    .line 30
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->protein:Ljava/lang/Double;

    move-object/from16 p1, p29

    .line 31
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->riboflavin:Ljava/lang/Double;

    move-object/from16 p1, p30

    .line 32
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->saturatedFat:Ljava/lang/Double;

    move-object/from16 p1, p31

    .line 33
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->selenium:Ljava/lang/Double;

    move-object/from16 p1, p32

    .line 34
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sodium:Ljava/lang/Double;

    move-object/from16 p1, p33

    .line 35
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sugar:Ljava/lang/Double;

    move-object/from16 p1, p34

    .line 36
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->thiamin:Ljava/lang/Double;

    move-object/from16 p1, p35

    .line 37
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalCarbohydrate:Ljava/lang/Double;

    move-object/from16 p1, p36

    .line 38
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalFat:Ljava/lang/Double;

    move-object/from16 p1, p37

    .line 39
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->transFat:Ljava/lang/Double;

    move-object/from16 p1, p38

    .line 40
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->unsaturatedFat:Ljava/lang/Double;

    move-object/from16 p1, p39

    .line 41
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminA:Ljava/lang/Double;

    move-object/from16 p1, p40

    .line 42
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB12:Ljava/lang/Double;

    move-object/from16 p1, p41

    .line 43
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB6:Ljava/lang/Double;

    move-object/from16 p1, p42

    .line 44
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminC:Ljava/lang/Double;

    move-object/from16 p1, p43

    .line 45
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminD:Ljava/lang/Double;

    move-object/from16 p1, p44

    .line 46
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminE:Ljava/lang/Double;

    move-object/from16 p1, p45

    .line 47
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminK:Ljava/lang/Double;

    move-object/from16 p1, p46

    .line 48
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->zinc:Ljava/lang/Double;

    move-object/from16 p1, p47

    .line 49
    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->name:Ljava/lang/String;

    move/from16 p1, p48

    .line 50
    iput p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->mealType:I

    .line 51
    iput-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    .line 52
    iput-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->deviceZoneId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;IILjava/lang/Object;)Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p51

    move/from16 v2, p52

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startTime:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startZoneOffset:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endTime:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endZoneOffset:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->biotin:Ljava/lang/Double;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->caffeine:Ljava/lang/Double;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->calcium:Ljava/lang/Double;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energy:Ljava/lang/Double;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energyFromFat:Ljava/lang/Double;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chloride:Ljava/lang/Double;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->cholesterol:Ljava/lang/Double;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chromium:Ljava/lang/Double;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->copper:Ljava/lang/Double;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move-object/from16 p1, v3

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_d

    iget-object v3, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->dietaryFiber:Ljava/lang/Double;

    goto :goto_d

    :cond_d
    move-object/from16 v3, p14

    :goto_d
    move-object/from16 p2, v3

    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget-object v3, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folate:Ljava/lang/Double;

    goto :goto_e

    :cond_e
    move-object/from16 v3, p15

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    if-eqz v17, :cond_f

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folicAcid:Ljava/lang/Double;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, p51, v17

    move-object/from16 p3, v1

    if-eqz v18, :cond_10

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iodine:Ljava/lang/Double;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, p51, v18

    move-object/from16 p4, v1

    if-eqz v19, :cond_11

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iron:Ljava/lang/Double;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, p51, v19

    move-object/from16 p5, v1

    if-eqz v19, :cond_12

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->magnesium:Ljava/lang/Double;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v19, 0x80000

    and-int v19, p51, v19

    move-object/from16 p6, v1

    if-eqz v19, :cond_13

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->manganese:Ljava/lang/Double;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v19, 0x100000

    and-int v19, p51, v19

    move-object/from16 p7, v1

    if-eqz v19, :cond_14

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->molybdenum:Ljava/lang/Double;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v19, 0x200000

    and-int v19, p51, v19

    move-object/from16 p8, v1

    if-eqz v19, :cond_15

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->monounsaturatedFat:Ljava/lang/Double;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v19, 0x400000

    and-int v19, p51, v19

    move-object/from16 p9, v1

    if-eqz v19, :cond_16

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->niacin:Ljava/lang/Double;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v19, 0x800000

    and-int v19, p51, v19

    move-object/from16 p10, v1

    if-eqz v19, :cond_17

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->pantothenicAcid:Ljava/lang/Double;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v19, 0x1000000

    and-int v19, p51, v19

    move-object/from16 p11, v1

    if-eqz v19, :cond_18

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->phosphorus:Ljava/lang/Double;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v19, 0x2000000

    and-int v19, p51, v19

    move-object/from16 p12, v1

    if-eqz v19, :cond_19

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->polyunsaturatedFat:Ljava/lang/Double;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v19, 0x4000000

    and-int v19, p51, v19

    move-object/from16 p13, v1

    if-eqz v19, :cond_1a

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->potassium:Ljava/lang/Double;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v19, 0x8000000

    and-int v19, p51, v19

    move-object/from16 p14, v1

    if-eqz v19, :cond_1b

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->protein:Ljava/lang/Double;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v19, 0x10000000

    and-int v19, p51, v19

    move-object/from16 p15, v1

    if-eqz v19, :cond_1c

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->riboflavin:Ljava/lang/Double;

    goto :goto_1c

    :cond_1c
    move-object/from16 v1, p29

    :goto_1c
    const/high16 v19, 0x20000000

    and-int v19, p51, v19

    move-object/from16 p16, v1

    if-eqz v19, :cond_1d

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->saturatedFat:Ljava/lang/Double;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p30

    :goto_1d
    const/high16 v19, 0x40000000    # 2.0f

    and-int v19, p51, v19

    move-object/from16 p17, v1

    if-eqz v19, :cond_1e

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->selenium:Ljava/lang/Double;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p31

    :goto_1e
    const/high16 v19, -0x80000000

    and-int v19, p51, v19

    move-object/from16 p18, v1

    if-eqz v19, :cond_1f

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sodium:Ljava/lang/Double;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v19, v2, 0x1

    move-object/from16 p19, v1

    if-eqz v19, :cond_20

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sugar:Ljava/lang/Double;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p33

    :goto_20
    and-int/lit8 v19, v2, 0x2

    move-object/from16 p20, v1

    if-eqz v19, :cond_21

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->thiamin:Ljava/lang/Double;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p34

    :goto_21
    and-int/lit8 v19, v2, 0x4

    move-object/from16 p21, v1

    if-eqz v19, :cond_22

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalCarbohydrate:Ljava/lang/Double;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v19, v2, 0x8

    move-object/from16 p22, v1

    if-eqz v19, :cond_23

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalFat:Ljava/lang/Double;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v19, v2, 0x10

    move-object/from16 p23, v1

    if-eqz v19, :cond_24

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->transFat:Ljava/lang/Double;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p37

    :goto_24
    and-int/lit8 v19, v2, 0x20

    move-object/from16 p24, v1

    if-eqz v19, :cond_25

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->unsaturatedFat:Ljava/lang/Double;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v19, v2, 0x40

    move-object/from16 p25, v1

    if-eqz v19, :cond_26

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminA:Ljava/lang/Double;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p26, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB12:Ljava/lang/Double;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    move-object/from16 p27, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB6:Ljava/lang/Double;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p41

    :goto_28
    move-object/from16 p28, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminC:Ljava/lang/Double;

    goto :goto_29

    :cond_29
    move-object/from16 v1, p42

    :goto_29
    move-object/from16 p29, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminD:Ljava/lang/Double;

    goto :goto_2a

    :cond_2a
    move-object/from16 v1, p43

    :goto_2a
    move-object/from16 p30, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminE:Ljava/lang/Double;

    goto :goto_2b

    :cond_2b
    move-object/from16 v1, p44

    :goto_2b
    move-object/from16 p31, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminK:Ljava/lang/Double;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p45

    :goto_2c
    move-object/from16 p32, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->zinc:Ljava/lang/Double;

    goto :goto_2d

    :cond_2d
    move-object/from16 v1, p46

    :goto_2d
    move-object/from16 p33, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->name:Ljava/lang/String;

    goto :goto_2e

    :cond_2e
    move-object/from16 v1, p47

    :goto_2e
    and-int v16, v2, v16

    move-object/from16 p34, v1

    if-eqz v16, :cond_2f

    iget v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->mealType:I

    goto :goto_2f

    :cond_2f
    move/from16 v1, p48

    :goto_2f
    and-int v16, v2, v17

    move/from16 p35, v1

    if-eqz v16, :cond_30

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    goto :goto_30

    :cond_30
    move-object/from16 v1, p49

    :goto_30
    and-int v2, v2, v18

    if-eqz v2, :cond_31

    iget-object v2, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->deviceZoneId:Ljava/lang/String;

    move-object/from16 p51, v2

    :goto_31
    move-object/from16 p36, p22

    move-object/from16 p37, p23

    move-object/from16 p38, p24

    move-object/from16 p39, p25

    move-object/from16 p40, p26

    move-object/from16 p41, p27

    move-object/from16 p42, p28

    move-object/from16 p43, p29

    move-object/from16 p44, p30

    move-object/from16 p45, p31

    move-object/from16 p46, p32

    move-object/from16 p47, p33

    move-object/from16 p48, p34

    move/from16 p49, p35

    move-object/from16 p50, v1

    move-object/from16 p22, p8

    move-object/from16 p23, p9

    move-object/from16 p24, p10

    move-object/from16 p25, p11

    move-object/from16 p26, p12

    move-object/from16 p27, p13

    move-object/from16 p28, p14

    move-object/from16 p29, p15

    move-object/from16 p30, p16

    move-object/from16 p31, p17

    move-object/from16 p32, p18

    move-object/from16 p33, p19

    move-object/from16 p34, p20

    move-object/from16 p35, p21

    move-object/from16 p16, v3

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move-object/from16 p15, p2

    move-object/from16 p17, p3

    move-object/from16 p18, p4

    move-object/from16 p19, p5

    move-object/from16 p20, p6

    move-object/from16 p21, p7

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_32

    :cond_31
    move-object/from16 p51, p50

    goto :goto_31

    :goto_32
    invoke-virtual/range {p1 .. p51}, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$health_connect_release(Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startTime:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startZoneOffset:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endTime:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endZoneOffset:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->biotin:Ljava/lang/Double;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->caffeine:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->calcium:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energy:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energyFromFat:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chloride:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->cholesterol:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xb

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chromium:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->copper:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xd

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->dietaryFiber:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xe

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folate:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xf

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folicAcid:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x10

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iodine:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x11

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iron:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x12

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->magnesium:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x13

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->manganese:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x14

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->molybdenum:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x15

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->monounsaturatedFat:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x16

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->niacin:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x17

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->pantothenicAcid:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x18

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->phosphorus:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x19

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->polyunsaturatedFat:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x1a

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->potassium:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x1b

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->protein:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x1c

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->riboflavin:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x1d

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->saturatedFat:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x1e

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->selenium:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x1f

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sodium:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x20

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sugar:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x21

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->thiamin:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x22

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalCarbohydrate:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x23

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalFat:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x24

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->transFat:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x25

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->unsaturatedFat:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x26

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminA:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x27

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB12:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x28

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB6:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x29

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminC:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x2a

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminD:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x2b

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminE:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x2c

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminK:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x2d

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->zinc:Ljava/lang/Double;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x2e

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x2f

    iget v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->mealType:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    const/16 v2, 0x30

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0x31

    iget-object p0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->deviceZoneId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chloride:Ljava/lang/Double;

    return-object v0
.end method

.method public final component11()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->cholesterol:Ljava/lang/Double;

    return-object v0
.end method

.method public final component12()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chromium:Ljava/lang/Double;

    return-object v0
.end method

.method public final component13()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->copper:Ljava/lang/Double;

    return-object v0
.end method

.method public final component14()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->dietaryFiber:Ljava/lang/Double;

    return-object v0
.end method

.method public final component15()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folate:Ljava/lang/Double;

    return-object v0
.end method

.method public final component16()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folicAcid:Ljava/lang/Double;

    return-object v0
.end method

.method public final component17()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iodine:Ljava/lang/Double;

    return-object v0
.end method

.method public final component18()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iron:Ljava/lang/Double;

    return-object v0
.end method

.method public final component19()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->magnesium:Ljava/lang/Double;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->manganese:Ljava/lang/Double;

    return-object v0
.end method

.method public final component21()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->molybdenum:Ljava/lang/Double;

    return-object v0
.end method

.method public final component22()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->monounsaturatedFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final component23()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->niacin:Ljava/lang/Double;

    return-object v0
.end method

.method public final component24()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->pantothenicAcid:Ljava/lang/Double;

    return-object v0
.end method

.method public final component25()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->phosphorus:Ljava/lang/Double;

    return-object v0
.end method

.method public final component26()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->polyunsaturatedFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final component27()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->potassium:Ljava/lang/Double;

    return-object v0
.end method

.method public final component28()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->protein:Ljava/lang/Double;

    return-object v0
.end method

.method public final component29()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->riboflavin:Ljava/lang/Double;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->saturatedFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final component31()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->selenium:Ljava/lang/Double;

    return-object v0
.end method

.method public final component32()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sodium:Ljava/lang/Double;

    return-object v0
.end method

.method public final component33()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sugar:Ljava/lang/Double;

    return-object v0
.end method

.method public final component34()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->thiamin:Ljava/lang/Double;

    return-object v0
.end method

.method public final component35()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalCarbohydrate:Ljava/lang/Double;

    return-object v0
.end method

.method public final component36()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final component37()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->transFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final component38()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->unsaturatedFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final component39()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminA:Ljava/lang/Double;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final component40()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB12:Ljava/lang/Double;

    return-object v0
.end method

.method public final component41()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB6:Ljava/lang/Double;

    return-object v0
.end method

.method public final component42()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminC:Ljava/lang/Double;

    return-object v0
.end method

.method public final component43()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminD:Ljava/lang/Double;

    return-object v0
.end method

.method public final component44()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminE:Ljava/lang/Double;

    return-object v0
.end method

.method public final component45()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminK:Ljava/lang/Double;

    return-object v0
.end method

.method public final component46()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->zinc:Ljava/lang/Double;

    return-object v0
.end method

.method public final component47()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component48()I
    .locals 1

    iget v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->mealType:I

    return v0
.end method

.method public final component49()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-object v0
.end method

.method public final component5()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->biotin:Ljava/lang/Double;

    return-object v0
.end method

.method public final component50()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->deviceZoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->caffeine:Ljava/lang/Double;

    return-object v0
.end method

.method public final component7()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->calcium:Ljava/lang/Double;

    return-object v0
.end method

.method public final component8()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energy:Ljava/lang/Double;

    return-object v0
.end method

.method public final component9()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energyFromFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;
    .locals 52

    const-string v0, "startTime"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    move-object/from16 v1, p49

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceZoneId"

    move-object/from16 v3, p50

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

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

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    move-object/from16 v28, p27

    move-object/from16 v29, p28

    move-object/from16 v30, p29

    move-object/from16 v31, p30

    move-object/from16 v32, p31

    move-object/from16 v33, p32

    move-object/from16 v34, p33

    move-object/from16 v35, p34

    move-object/from16 v36, p35

    move-object/from16 v37, p36

    move-object/from16 v38, p37

    move-object/from16 v39, p38

    move-object/from16 v40, p39

    move-object/from16 v41, p40

    move-object/from16 v42, p41

    move-object/from16 v43, p42

    move-object/from16 v44, p43

    move-object/from16 v45, p44

    move-object/from16 v46, p45

    move-object/from16 v47, p46

    move-object/from16 v48, p47

    move/from16 v49, p48

    move-object/from16 v50, p49

    move-object/from16 v51, v3

    move-object/from16 v3, p2

    invoke-direct/range {v1 .. v51}, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startZoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startZoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endZoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endZoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->biotin:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->biotin:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->caffeine:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->caffeine:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->calcium:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->calcium:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energy:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energy:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energyFromFat:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energyFromFat:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chloride:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chloride:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->cholesterol:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->cholesterol:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chromium:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chromium:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->copper:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->copper:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->dietaryFiber:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->dietaryFiber:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folate:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folate:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folicAcid:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folicAcid:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iodine:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iodine:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iron:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iron:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->magnesium:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->magnesium:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->manganese:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->manganese:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->molybdenum:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->molybdenum:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->monounsaturatedFat:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->monounsaturatedFat:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->niacin:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->niacin:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->pantothenicAcid:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->pantothenicAcid:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->phosphorus:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->phosphorus:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->polyunsaturatedFat:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->polyunsaturatedFat:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->potassium:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->potassium:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->protein:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->protein:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->riboflavin:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->riboflavin:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->saturatedFat:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->saturatedFat:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->selenium:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->selenium:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sodium:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sodium:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sugar:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sugar:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->thiamin:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->thiamin:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalCarbohydrate:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalCarbohydrate:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalFat:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalFat:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->transFat:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->transFat:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->unsaturatedFat:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->unsaturatedFat:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminA:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminA:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB12:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB12:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB6:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB6:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminC:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminC:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminD:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminD:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    return v2

    :cond_2c
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminE:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminE:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminK:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminK:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    return v2

    :cond_2e
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->zinc:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->zinc:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    return v2

    :cond_30
    iget v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->mealType:I

    iget v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->mealType:I

    if-eq v1, v3, :cond_31

    return v2

    :cond_31
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    return v2

    :cond_32
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->deviceZoneId:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->deviceZoneId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_33

    return v2

    :cond_33
    return v0
.end method

.method public final getBiotin()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->biotin:Ljava/lang/Double;

    return-object v0
.end method

.method public final getCaffeine()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->caffeine:Ljava/lang/Double;

    return-object v0
.end method

.method public final getCalcium()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->calcium:Ljava/lang/Double;

    return-object v0
.end method

.method public final getChloride()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chloride:Ljava/lang/Double;

    return-object v0
.end method

.method public final getCholesterol()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->cholesterol:Ljava/lang/Double;

    return-object v0
.end method

.method public final getChromium()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chromium:Ljava/lang/Double;

    return-object v0
.end method

.method public final getCopper()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->copper:Ljava/lang/Double;

    return-object v0
.end method

.method public final getDeviceZoneId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->deviceZoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDietaryFiber()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->dietaryFiber:Ljava/lang/Double;

    return-object v0
.end method

.method public final getEndTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndZoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnergy()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energy:Ljava/lang/Double;

    return-object v0
.end method

.method public final getEnergyFromFat()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energyFromFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final getFolate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folate:Ljava/lang/Double;

    return-object v0
.end method

.method public final getFolicAcid()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folicAcid:Ljava/lang/Double;

    return-object v0
.end method

.method public final getIodine()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iodine:Ljava/lang/Double;

    return-object v0
.end method

.method public final getIron()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iron:Ljava/lang/Double;

    return-object v0
.end method

.method public final getMagnesium()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->magnesium:Ljava/lang/Double;

    return-object v0
.end method

.method public final getManganese()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->manganese:Ljava/lang/Double;

    return-object v0
.end method

.method public final getMealType()I
    .locals 1

    iget v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->mealType:I

    return v0
.end method

.method public final getMetadata()Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    return-object v0
.end method

.method public final getMolybdenum()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->molybdenum:Ljava/lang/Double;

    return-object v0
.end method

.method public final getMonounsaturatedFat()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->monounsaturatedFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getNiacin()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->niacin:Ljava/lang/Double;

    return-object v0
.end method

.method public final getPantothenicAcid()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->pantothenicAcid:Ljava/lang/Double;

    return-object v0
.end method

.method public final getPhosphorus()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->phosphorus:Ljava/lang/Double;

    return-object v0
.end method

.method public final getPolyunsaturatedFat()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->polyunsaturatedFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final getPotassium()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->potassium:Ljava/lang/Double;

    return-object v0
.end method

.method public final getProtein()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->protein:Ljava/lang/Double;

    return-object v0
.end method

.method public final getRiboflavin()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->riboflavin:Ljava/lang/Double;

    return-object v0
.end method

.method public final getSaturatedFat()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->saturatedFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final getSelenium()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->selenium:Ljava/lang/Double;

    return-object v0
.end method

.method public final getSodium()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sodium:Ljava/lang/Double;

    return-object v0
.end method

.method public final getStartTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getStartZoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final getSugar()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sugar:Ljava/lang/Double;

    return-object v0
.end method

.method public final getThiamin()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->thiamin:Ljava/lang/Double;

    return-object v0
.end method

.method public final getTotalCarbohydrate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalCarbohydrate:Ljava/lang/Double;

    return-object v0
.end method

.method public final getTotalFat()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final getTransFat()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->transFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final getUnsaturatedFat()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->unsaturatedFat:Ljava/lang/Double;

    return-object v0
.end method

.method public final getVitaminA()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminA:Ljava/lang/Double;

    return-object v0
.end method

.method public final getVitaminB12()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB12:Ljava/lang/Double;

    return-object v0
.end method

.method public final getVitaminB6()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB6:Ljava/lang/Double;

    return-object v0
.end method

.method public final getVitaminC()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminC:Ljava/lang/Double;

    return-object v0
.end method

.method public final getVitaminD()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminD:Ljava/lang/Double;

    return-object v0
.end method

.method public final getVitaminE()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminE:Ljava/lang/Double;

    return-object v0
.end method

.method public final getVitaminK()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminK:Ljava/lang/Double;

    return-object v0
.end method

.method public final getZinc()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->zinc:Ljava/lang/Double;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startTime:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startZoneOffset:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endTime:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endZoneOffset:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->biotin:Ljava/lang/Double;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->caffeine:Ljava/lang/Double;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->calcium:Ljava/lang/Double;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energy:Ljava/lang/Double;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energyFromFat:Ljava/lang/Double;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chloride:Ljava/lang/Double;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->cholesterol:Ljava/lang/Double;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chromium:Ljava/lang/Double;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->copper:Ljava/lang/Double;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->dietaryFiber:Ljava/lang/Double;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folate:Ljava/lang/Double;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folicAcid:Ljava/lang/Double;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iodine:Ljava/lang/Double;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iron:Ljava/lang/Double;

    if-nez v2, :cond_f

    move v2, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->magnesium:Ljava/lang/Double;

    if-nez v2, :cond_10

    move v2, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->manganese:Ljava/lang/Double;

    if-nez v2, :cond_11

    move v2, v3

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->molybdenum:Ljava/lang/Double;

    if-nez v2, :cond_12

    move v2, v3

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->monounsaturatedFat:Ljava/lang/Double;

    if-nez v2, :cond_13

    move v2, v3

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->niacin:Ljava/lang/Double;

    if-nez v2, :cond_14

    move v2, v3

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_14
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->pantothenicAcid:Ljava/lang/Double;

    if-nez v2, :cond_15

    move v2, v3

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_15
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->phosphorus:Ljava/lang/Double;

    if-nez v2, :cond_16

    move v2, v3

    goto :goto_16

    :cond_16
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_16
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->polyunsaturatedFat:Ljava/lang/Double;

    if-nez v2, :cond_17

    move v2, v3

    goto :goto_17

    :cond_17
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_17
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->potassium:Ljava/lang/Double;

    if-nez v2, :cond_18

    move v2, v3

    goto :goto_18

    :cond_18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_18
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->protein:Ljava/lang/Double;

    if-nez v2, :cond_19

    move v2, v3

    goto :goto_19

    :cond_19
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_19
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->riboflavin:Ljava/lang/Double;

    if-nez v2, :cond_1a

    move v2, v3

    goto :goto_1a

    :cond_1a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->saturatedFat:Ljava/lang/Double;

    if-nez v2, :cond_1b

    move v2, v3

    goto :goto_1b

    :cond_1b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->selenium:Ljava/lang/Double;

    if-nez v2, :cond_1c

    move v2, v3

    goto :goto_1c

    :cond_1c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sodium:Ljava/lang/Double;

    if-nez v2, :cond_1d

    move v2, v3

    goto :goto_1d

    :cond_1d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sugar:Ljava/lang/Double;

    if-nez v2, :cond_1e

    move v2, v3

    goto :goto_1e

    :cond_1e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->thiamin:Ljava/lang/Double;

    if-nez v2, :cond_1f

    move v2, v3

    goto :goto_1f

    :cond_1f
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalCarbohydrate:Ljava/lang/Double;

    if-nez v2, :cond_20

    move v2, v3

    goto :goto_20

    :cond_20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_20
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalFat:Ljava/lang/Double;

    if-nez v2, :cond_21

    move v2, v3

    goto :goto_21

    :cond_21
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_21
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->transFat:Ljava/lang/Double;

    if-nez v2, :cond_22

    move v2, v3

    goto :goto_22

    :cond_22
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_22
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->unsaturatedFat:Ljava/lang/Double;

    if-nez v2, :cond_23

    move v2, v3

    goto :goto_23

    :cond_23
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_23
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminA:Ljava/lang/Double;

    if-nez v2, :cond_24

    move v2, v3

    goto :goto_24

    :cond_24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_24
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB12:Ljava/lang/Double;

    if-nez v2, :cond_25

    move v2, v3

    goto :goto_25

    :cond_25
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_25
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB6:Ljava/lang/Double;

    if-nez v2, :cond_26

    move v2, v3

    goto :goto_26

    :cond_26
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_26
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminC:Ljava/lang/Double;

    if-nez v2, :cond_27

    move v2, v3

    goto :goto_27

    :cond_27
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_27
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminD:Ljava/lang/Double;

    if-nez v2, :cond_28

    move v2, v3

    goto :goto_28

    :cond_28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_28
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminE:Ljava/lang/Double;

    if-nez v2, :cond_29

    move v2, v3

    goto :goto_29

    :cond_29
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_29
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminK:Ljava/lang/Double;

    if-nez v2, :cond_2a

    move v2, v3

    goto :goto_2a

    :cond_2a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->zinc:Ljava/lang/Double;

    if-nez v2, :cond_2b

    move v2, v3

    goto :goto_2b

    :cond_2b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->name:Ljava/lang/String;

    if-nez v2, :cond_2c

    goto :goto_2c

    :cond_2c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2c
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->mealType:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    invoke-virtual {v2}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->deviceZoneId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 53

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startTime:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->startZoneOffset:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endTime:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->endZoneOffset:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->biotin:Ljava/lang/Double;

    iget-object v6, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->caffeine:Ljava/lang/Double;

    iget-object v7, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->calcium:Ljava/lang/Double;

    iget-object v8, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energy:Ljava/lang/Double;

    iget-object v9, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->energyFromFat:Ljava/lang/Double;

    iget-object v10, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chloride:Ljava/lang/Double;

    iget-object v11, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->cholesterol:Ljava/lang/Double;

    iget-object v12, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->chromium:Ljava/lang/Double;

    iget-object v13, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->copper:Ljava/lang/Double;

    iget-object v14, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->dietaryFiber:Ljava/lang/Double;

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folate:Ljava/lang/Double;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->folicAcid:Ljava/lang/Double;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iodine:Ljava/lang/Double;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->iron:Ljava/lang/Double;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->magnesium:Ljava/lang/Double;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->manganese:Ljava/lang/Double;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->molybdenum:Ljava/lang/Double;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->monounsaturatedFat:Ljava/lang/Double;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->niacin:Ljava/lang/Double;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->pantothenicAcid:Ljava/lang/Double;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->phosphorus:Ljava/lang/Double;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->polyunsaturatedFat:Ljava/lang/Double;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->potassium:Ljava/lang/Double;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->protein:Ljava/lang/Double;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->riboflavin:Ljava/lang/Double;

    move-object/from16 v30, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->saturatedFat:Ljava/lang/Double;

    move-object/from16 v31, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->selenium:Ljava/lang/Double;

    move-object/from16 v32, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sodium:Ljava/lang/Double;

    move-object/from16 v33, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->sugar:Ljava/lang/Double;

    move-object/from16 v34, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->thiamin:Ljava/lang/Double;

    move-object/from16 v35, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalCarbohydrate:Ljava/lang/Double;

    move-object/from16 v36, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->totalFat:Ljava/lang/Double;

    move-object/from16 v37, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->transFat:Ljava/lang/Double;

    move-object/from16 v38, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->unsaturatedFat:Ljava/lang/Double;

    move-object/from16 v39, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminA:Ljava/lang/Double;

    move-object/from16 v40, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB12:Ljava/lang/Double;

    move-object/from16 v41, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminB6:Ljava/lang/Double;

    move-object/from16 v42, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminC:Ljava/lang/Double;

    move-object/from16 v43, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminD:Ljava/lang/Double;

    move-object/from16 v44, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminE:Ljava/lang/Double;

    move-object/from16 v45, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->vitaminK:Ljava/lang/Double;

    move-object/from16 v46, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->zinc:Ljava/lang/Double;

    move-object/from16 v47, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->name:Ljava/lang/String;

    move-object/from16 v48, v15

    iget v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->mealType:I

    move/from16 v49, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->metadata:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    move-object/from16 v50, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->deviceZoneId:Ljava/lang/String;

    const-string v0, ", startZoneOffset="

    move-object/from16 v51, v15

    const-string v15, ", endTime="

    move-object/from16 v52, v13

    const-string v13, "HealthConnectNutritionModel(startTime="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endZoneOffset="

    const-string v2, ", biotin="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", caffeine="

    const-string v2, ", calcium="

    invoke-static {v0, v5, v1, v6, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", energy="

    const-string v2, ", energyFromFat="

    invoke-static {v0, v7, v1, v8, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", chloride="

    const-string v2, ", cholesterol="

    invoke-static {v0, v9, v1, v10, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", chromium="

    const-string v2, ", copper="

    invoke-static {v0, v11, v1, v12, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", dietaryFiber="

    const-string v2, ", folate="

    move-object/from16 v3, v52

    invoke-static {v0, v3, v1, v14, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", folicAcid="

    const-string v2, ", iodine="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", iron="

    const-string v2, ", magnesium="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", manganese="

    const-string v2, ", molybdenum="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", monounsaturatedFat="

    const-string v2, ", niacin="

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", pantothenicAcid="

    const-string v2, ", phosphorus="

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", polyunsaturatedFat="

    const-string v2, ", potassium="

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", protein="

    const-string v2, ", riboflavin="

    move-object/from16 v3, v28

    move-object/from16 v4, v29

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", saturatedFat="

    const-string v2, ", selenium="

    move-object/from16 v3, v30

    move-object/from16 v4, v31

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", sodium="

    const-string v2, ", sugar="

    move-object/from16 v3, v32

    move-object/from16 v4, v33

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", thiamin="

    const-string v2, ", totalCarbohydrate="

    move-object/from16 v3, v34

    move-object/from16 v4, v35

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", totalFat="

    const-string v2, ", transFat="

    move-object/from16 v3, v36

    move-object/from16 v4, v37

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", unsaturatedFat="

    const-string v2, ", vitaminA="

    move-object/from16 v3, v38

    move-object/from16 v4, v39

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", vitaminB12="

    const-string v2, ", vitaminB6="

    move-object/from16 v3, v40

    move-object/from16 v4, v41

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", vitaminC="

    const-string v2, ", vitaminD="

    move-object/from16 v3, v42

    move-object/from16 v4, v43

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", vitaminE="

    const-string v2, ", vitaminK="

    move-object/from16 v3, v44

    move-object/from16 v4, v45

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", zinc="

    const-string v2, ", name="

    move-object/from16 v3, v46

    move-object/from16 v4, v47

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", mealType="

    const-string v2, ", metadata="

    move-object/from16 v3, v48

    move/from16 v4, v49

    invoke-static {v4, v3, v1, v2, v0}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    move-object/from16 v1, v50

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceZoneId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
