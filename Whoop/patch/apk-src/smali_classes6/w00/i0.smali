.class public final Lw00/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv00/b0;


# static fields
.field public static final a:Lw00/i0;

.field public static final b:Ly00/f4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw00/i0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw00/i0;->a:Lw00/i0;

    sget-object v0, Ly00/f4;->P:Ly00/f4;

    sput-object v0, Lw00/i0;->b:Ly00/f4;

    return-void
.end method


# virtual methods
.method public final a(Z)Ljava/util/Set;
    .locals 0

    sget-object p1, Lv00/i;->w:Lv00/g;

    invoke-static {p1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lv00/q0;
    .locals 1

    sget-object v0, Lw00/j0;->a:Lw00/j0;

    return-object v0
.end method

.method public final c(Lv00/c0;)Z
    .locals 0

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

    sget-object v0, Lw00/i0;->b:Ly00/f4;

    return-object v0
.end method
