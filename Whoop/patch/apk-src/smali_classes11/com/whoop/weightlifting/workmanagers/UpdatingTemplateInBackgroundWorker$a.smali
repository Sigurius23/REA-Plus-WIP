.class public final Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$a;",
        "",
        "<init>",
        "()V",
        "",
        "serializedUpdateTemplateKey",
        "Lic/a0;",
        "b",
        "(Ljava/lang/String;)Lic/a0;",
        "workoutStartTimeInMillis",
        "a",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lic/p0;",
        "workManager",
        "workRequest",
        "Lic/e0;",
        "c",
        "(Lic/p0;Ljava/lang/String;Ljava/lang/String;Lic/a0;)Lic/e0;",
        "WORK_NAME_PREFIX",
        "Ljava/lang/String;",
        "KEY_WORKOUT_TEMPLATE",
        "TAG",
        "weightlifting_release"
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
    invoke-direct {p0}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$a;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "strength-trainer-updating-template-"

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final b(Ljava/lang/String;)Lic/a0;
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

    const-class v2, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

    invoke-direct {v0, v2}, Lic/q0;-><init>(Ljava/lang/Class;)V

    new-instance v2, Ll83/k;

    const-string v3, "workoutTemplate"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2}, [Ll83/k;

    move-result-object p1

    new-instance v2, Lb0/b;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lb0/b;-><init>(I)V

    const/4 v3, 0x0

    aget-object p1, p1, v3

    iget-object v3, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {v2, p1, v3}, Lb0/b;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lb0/b;->b()Lic/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    const-string v0, "UpdatingTemplateInBackgroundWorker"

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

.method public static synthetic d(Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$a;Lic/p0;Ljava/lang/String;Ljava/lang/String;Lic/a0;ILjava/lang/Object;)Lic/e0;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    invoke-direct {p0, p2}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$a;->b(Ljava/lang/String;)Lic/a0;

    move-result-object p4

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$a;->c(Lic/p0;Ljava/lang/String;Ljava/lang/String;Lic/a0;)Lic/e0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Lic/p0;Ljava/lang/String;Ljava/lang/String;Lic/a0;)Lic/e0;
    .locals 1

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializedUpdateTemplateKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "workoutStartTimeInMillis"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "workRequest"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    sget-object p3, Lic/l;->x:Lic/l;

    invoke-virtual {p1, p2, p3, p4}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    move-result-object p1

    return-object p1
.end method
