.class public abstract La3/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lvb/g;->a()Ly3/d;

    move-result-object v0

    sput-object v0, La3/q0;->a:Ly3/d;

    return-void
.end method

.method public static final a(La3/n0;)Landroidx/compose/ui/node/Owner;
    .locals 0

    iget-object p0, p0, La3/n0;->M:Landroidx/compose/ui/node/Owner;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "LayoutNode should be attached to an owner"

    invoke-static {p0}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object p0

    throw p0
.end method
