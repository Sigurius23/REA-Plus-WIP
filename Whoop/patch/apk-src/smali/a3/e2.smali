.class public final La3/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b2;


# instance fields
.field public w:Ly2/s0;

.field public final x:La3/w0;


# direct methods
.method public constructor <init>(Ly2/s0;La3/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/e2;->w:Ly2/s0;

    iput-object p2, p0, La3/e2;->x:La3/w0;

    return-void
.end method


# virtual methods
.method public final U()Z
    .locals 1

    iget-object v0, p0, La3/e2;->x:La3/w0;

    invoke-virtual {v0}, La3/w0;->L0()Ly2/y;

    move-result-object v0

    invoke-interface {v0}, Ly2/y;->g()Z

    move-result v0

    return v0
.end method
