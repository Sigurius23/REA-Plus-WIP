.class public final synthetic Lp6/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lp6/o1;->w:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    new-instance v0, Ly3/h;

    iget-wide v1, p0, Lp6/o1;->w:J

    invoke-direct {v0, v1, v2}, Ly3/h;-><init>(J)V

    return-object v0
.end method
