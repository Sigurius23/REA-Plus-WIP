.class public final Lf0/j0;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/p2;


# static fields
.field public static final P:Lf0/b;


# instance fields
.field public O:La6/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lf0/j0;->P:Lf0/b;

    return-void
.end method


# virtual methods
.method public final X0(Ly2/y;)V
    .locals 1

    iget-object v0, p0, Lf0/j0;->O:La6/i;

    invoke-virtual {v0, p1}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, La3/g;->g(La3/p2;)La3/p2;

    move-result-object v0

    check-cast v0, Lf0/j0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lf0/j0;->X0(Ly2/y;)V

    :cond_0
    return-void
.end method

.method public final f()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lf0/j0;->P:Lf0/b;

    return-object v0
.end method
