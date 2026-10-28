.class public final Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J7\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "serializedState",
        "Llu2/d;",
        "jsonFormat",
        "Ltr2/n;",
        "logger",
        "Lrr2/c;",
        "crashReporter",
        "Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;",
        "deserialize",
        "(Ljava/lang/String;Llu2/d;Ltr2/n;Lrr2/c;)Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;",
        "Lwc3/c;",
        "serializer",
        "()Lwc3/c;",
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
    invoke-direct {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;-><init>()V

    return-void
.end method

.method public static synthetic deserialize$default(Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;Ljava/lang/String;Llu2/d;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;->deserialize(Ljava/lang/String;Llu2/d;Ltr2/n;Lrr2/c;)Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final deserialize(Ljava/lang/String;Llu2/d;Ltr2/n;Lrr2/c;)Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;
    .locals 1

    const-string v0, "serializedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jsonFormat"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p2}, Llu2/d;->b()Lad3/c;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$Companion;->serializer()Lwc3/c;

    move-result-object v0

    check-cast v0, Lwc3/b;

    invoke-virtual {p2, v0, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "Error deserializing WorkoutSessionState (via kotlinx.serialization)"

    invoke-interface {p3, v0, p1, p2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_0
    if-eqz p4, :cond_1

    invoke-interface {p4, p1}, Lrr2/c;->p(Ljava/lang/Throwable;)V

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutSessionState$$serializer;

    return-object v0
.end method
