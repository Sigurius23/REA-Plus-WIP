.class public final Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$a;",
        "",
        "<init>",
        "()V",
        "",
        "timestamp",
        "",
        "strapSerial",
        "Lic/a0;",
        "b",
        "(JLjava/lang/String;)Lic/a0;",
        "a",
        "(J)Ljava/lang/String;",
        "Lic/p0;",
        "workManager",
        "Lic/e0;",
        "c",
        "(Lic/p0;JLjava/lang/String;)Lic/e0;",
        "TAG",
        "Ljava/lang/String;",
        "KEY_READING_TRAILING_TIMESTAMP",
        "KEY_STRAP_SERIAL",
        "DEFAULT_STRAP_SERIAL",
        "labrador_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$a;-><init>()V

    return-void
.end method

.method private final a(J)Ljava/lang/String;
    .locals 1

    const-string v0, "UploadLabradorReadingInBackgroundWorker"

    invoke-static {p1, p2, v0}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final b(JLjava/lang/String;)Lic/a0;
    .locals 13

    new-instance v0, Lrc/e;

    sget-object v0, Lic/x;->w:Lic/x;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v3, Lic/x;->x:Lic/x;

    new-instance v2, Lrc/e;

    const/4 v1, 0x0

    invoke-direct {v2, v1}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v12

    new-instance v1, Lic/e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, -0x1

    move-wide v10, v8

    invoke-direct/range {v1 .. v12}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    new-instance v0, Lic/z;

    const-class v2, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;

    invoke-direct {v0, v2}, Lic/q0;-><init>(Ljava/lang/Class;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v4, "trailingTimestamp"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v4, "strapSerial"

    move-object/from16 v5, p3

    invoke-direct {v2, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v2}, [Ll83/k;

    move-result-object v2

    new-instance v3, Lb0/b;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lb0/b;-><init>(I)V

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x2

    if-ge v4, v5, :cond_0

    aget-object v5, v2, v4

    iget-object v6, v5, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {v3, v5, v6}, Lb0/b;->d(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lb0/b;->b()Lic/g;

    move-result-object v2

    invoke-virtual {v0, v2}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    const-string v2, "UploadLabradorReadingInBackgroundWorker"

    invoke-virtual {v0, v2}, Lic/q0;->a(Ljava/lang/String;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lic/q0;->a(Ljava/lang/String;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    invoke-virtual {p1, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    sget-object p2, Lic/a;->x:Lic/a;

    const-wide/16 v0, 0x2710

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p2, v0, v1, v2}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    invoke-virtual {p1}, Lic/q0;->b()Lic/r0;

    move-result-object p1

    check-cast p1, Lic/a0;

    return-object p1
.end method


# virtual methods
.method public final c(Lic/p0;JLjava/lang/String;)Lic/e0;
    .locals 2

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapSerial"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$a;->a(J)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lic/l;->x:Lic/l;

    invoke-direct {p0, p2, p3, p4}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$a;->b(JLjava/lang/String;)Lic/a0;

    move-result-object p2

    invoke-virtual {p1, v0, v1, p2}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    move-result-object p1

    return-object p1
.end method
