.class public final Lw00/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv00/b0;


# static fields
.field public static final a:Lw00/p0;

.field public static final b:Ly00/f4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw00/p0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw00/p0;->a:Lw00/p0;

    sget-object v0, Ly00/f4;->e0:Ly00/f4;

    sput-object v0, Lw00/p0;->b:Ly00/f4;

    return-void
.end method


# virtual methods
.method public final a(Z)Ljava/util/Set;
    .locals 0

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1
.end method

.method public final b()Lv00/q0;
    .locals 1

    sget-object v0, Lw00/b;->v:Lw00/b;

    return-object v0
.end method

.method public final c(Lv00/c0;)Z
    .locals 2

    sget-object v0, Lw00/p0;->b:Ly00/f4;

    iget-object v1, v0, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lv00/c0;->x(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lv00/c0;->H(Ly00/f4;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getType()Ly00/f4;
    .locals 1

    sget-object v0, Lw00/p0;->b:Ly00/f4;

    return-object v0
.end method
