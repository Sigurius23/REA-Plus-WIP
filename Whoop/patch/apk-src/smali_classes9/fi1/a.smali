.class public final Lfi1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfi1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lfi1/a;",
        "",
        "Lic/p0;",
        "workManager",
        "<init>",
        "(Lic/p0;)V",
        "",
        "sessionStartTimeMs",
        "",
        "b",
        "(J)Ljava/lang/String;",
        "sessionEndTimeMs",
        "Ll83/a0;",
        "a",
        "(JJ)V",
        "Lic/p0;",
        "gps-tracking_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final b:Lfi1/a$a;

.field public static final c:I


# instance fields
.field private final a:Lic/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfi1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfi1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfi1/a;->b:Lfi1/a$a;

    const/16 v0, 0x8

    sput v0, Lfi1/a;->c:I

    return-void
.end method

.method public constructor <init>(Lic/p0;)V
    .locals 1

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfi1/a;->a:Lic/p0;

    return-void
.end method

.method private final b(J)Ljava/lang/String;
    .locals 1

    const-string v0, "foreground-gps-upload-"

    invoke-static {p1, p2, v0}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a(JJ)V
    .locals 14

    new-instance v0, Lic/z;

    const-class v1, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;

    invoke-direct {v0, v1}, Lic/q0;-><init>(Ljava/lang/Class;)V

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "sessionStartTimeMs"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-instance v3, Ll83/k;

    const-string v4, "sessionEndTimeMs"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3}, [Ll83/k;

    move-result-object v1

    new-instance v2, Lb0/b;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lb0/b;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    if-ge v3, v4, :cond_0

    aget-object v4, v1, v3

    iget-object v5, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {v2, v4, v5}, Lb0/b;->d(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lb0/b;->b()Lic/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    const-string v1, "ForegroundGpsUploadWorker"

    invoke-virtual {v0, v1}, Lic/q0;->a(Ljava/lang/String;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    new-instance v1, Lrc/e;

    sget-object v1, Lic/x;->w:Lic/x;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v4, Lic/x;->x:Lic/x;

    new-instance v3, Lrc/e;

    const/4 v2, 0x0

    invoke-direct {v3, v2}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v13

    new-instance v2, Lic/e;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, -0x1

    move-wide v11, v9

    invoke-direct/range {v2 .. v13}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    invoke-virtual {v0, v2}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    sget-object v1, Lic/a;->x:Lic/a;

    const-wide/16 v2, 0x2710

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3, v4}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object v0

    check-cast v0, Lic/z;

    invoke-virtual {v0}, Lic/q0;->b()Lic/r0;

    move-result-object v0

    check-cast v0, Lic/a0;

    iget-object v1, p0, Lfi1/a;->a:Lic/p0;

    invoke-direct/range {p0 .. p2}, Lfi1/a;->b(J)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lic/l;->x:Lic/l;

    invoke-virtual {v1, v2, v3, v0}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    return-void
.end method
