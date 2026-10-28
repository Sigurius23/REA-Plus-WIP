.class public final Ltp/t;
.super Ltp/s;
.source "SourceFile"


# instance fields
.field public final i:Lq/f;


# direct methods
.method public constructor <init>(Lcq/i;Lq/f;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Ltp/s;-><init>(ILcq/i;)V

    iput-object p2, p0, Ltp/t;->i:Lq/f;

    return-void
.end method


# virtual methods
.method public final i0()V
    .locals 1

    iget-object v0, p0, Ltp/t;->i:Lq/f;

    invoke-virtual {v0}, Lq/f;->s()V

    return-void
.end method
