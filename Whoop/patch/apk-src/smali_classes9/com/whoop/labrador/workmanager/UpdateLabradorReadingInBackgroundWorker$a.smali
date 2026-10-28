.class public final Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00082\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J;\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00082\u0006\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0017\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;",
        "",
        "<init>",
        "()V",
        "",
        "id",
        "",
        "timeStamp",
        "",
        "symptoms",
        "notes",
        "Lic/a0;",
        "b",
        "(Ljava/lang/String;JLjava/util/List;Ljava/lang/String;)Lic/a0;",
        "timestamp",
        "a",
        "(J)Ljava/lang/String;",
        "Lic/p0;",
        "workManager",
        "Lic/e0;",
        "c",
        "(Lic/p0;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;)Lic/e0;",
        "TAG",
        "Ljava/lang/String;",
        "KEY_READING_ID",
        "KEY_READING_TRAILING_TIMESTAMP",
        "KEY_SYMPTOMS",
        "KEY_NOTES",
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
    invoke-direct {p0}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;-><init>()V

    return-void
.end method

.method private final a(J)Ljava/lang/String;
    .locals 1

    const-string v0, "UpdateLabradorReadingInBackgroundWorker"

    invoke-static {p1, p2, v0}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final b(Ljava/lang/String;JLjava/util/List;Ljava/lang/String;)Lic/a0;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lic/a0;"
        }
    .end annotation

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

    const-class v2, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker;

    invoke-direct {v0, v2}, Lic/q0;-><init>(Ljava/lang/Class;)V

    new-instance v2, Ll83/k;

    const-string v3, "id"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    new-instance v3, Ll83/k;

    const-string v4, "trailingTimestamp"

    invoke-direct {v3, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 p1, p4

    check-cast p1, Ljava/util/Collection;

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/String;

    invoke-interface {p1, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    new-instance v5, Ll83/k;

    const-string v6, "symptoms"

    invoke-direct {v5, v6, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v6, "notes"

    move-object/from16 v7, p5

    invoke-direct {p1, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v5, p1}, [Ll83/k;

    move-result-object p1

    new-instance v2, Lb0/b;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lb0/b;-><init>(I)V

    :goto_0
    const/4 v3, 0x4

    if-ge v4, v3, :cond_0

    aget-object v3, p1, v4

    iget-object v5, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {v2, v3, v5}, Lb0/b;->d(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lb0/b;->b()Lic/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    const-string v0, "UpdateLabradorReadingInBackgroundWorker"

    invoke-virtual {p1, v0}, Lic/q0;->a(Ljava/lang/String;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide v3, p2

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lic/q0;->a(Ljava/lang/String;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    invoke-virtual {p1, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    sget-object v0, Lic/a;->x:Lic/a;

    const-wide/16 v1, 0x2710

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    invoke-virtual {p1}, Lic/q0;->b()Lic/r0;

    move-result-object p1

    check-cast p1, Lic/a0;

    return-object p1
.end method


# virtual methods
.method public final c(Lic/p0;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;)Lic/e0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic/p0;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lic/e0;"
        }
    .end annotation

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "symptoms"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notes"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p4}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;->a(J)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lic/l;->x:Lic/l;

    move-object v2, p0

    move-object v3, p2

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v2 .. v7}, Lcom/whoop/labrador/workmanager/UpdateLabradorReadingInBackgroundWorker$a;->b(Ljava/lang/String;JLjava/util/List;Ljava/lang/String;)Lic/a0;

    move-result-object p2

    invoke-virtual {p1, v0, v1, p2}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    move-result-object p1

    return-object p1
.end method
