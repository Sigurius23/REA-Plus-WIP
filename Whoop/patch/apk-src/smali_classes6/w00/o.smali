.class public final Lw00/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv00/b0;


# static fields
.field public static final a:Lw00/o;

.field public static final b:Ly00/f4;

.field public static final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw00/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lw00/o;->a:Lw00/o;

    sget-object v0, Ly00/f4;->I:Ly00/f4;

    sput-object v0, Lw00/o;->b:Ly00/f4;

    const/4 v0, 0x1

    sput-boolean v0, Lw00/o;->c:Z

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

    sget-object v0, Lw00/p;->b:Lw00/p;

    return-object v0
.end method

.method public final c(Lv00/c0;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final d()Z
    .locals 1

    sget-boolean v0, Lw00/o;->c:Z

    return v0
.end method

.method public final getType()Ly00/f4;
    .locals 1

    sget-object v0, Lw00/o;->b:Ly00/f4;

    return-object v0
.end method
