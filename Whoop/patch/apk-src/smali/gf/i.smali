.class public final Lgf/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgf/b;


# static fields
.field public static final w:Lgf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgf/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lgf/i;->w:Lgf/i;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public final b(Lgf/a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Lgf/a;)Z
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lgf/b;

    if-eqz v0, :cond_0

    check-cast p1, Lgf/b;

    invoke-interface {p1}, Lgf/b;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
