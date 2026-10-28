.class public final Lmf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmf/h;


# static fields
.field public static final c:Lmf/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmf/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lmf/g;->c:Lmf/g;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Set;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final e(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lmf/h;

    if-eqz v0, :cond_0

    check-cast p1, Lmf/h;

    invoke-interface {p1}, Lgf/t;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
