.class public final Leh/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lne3/p;

.field public final b:Leh/e;


# direct methods
.method public constructor <init>(JLbc3/z;Lne3/p;Lne3/e0;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Leh/h;->a:Lne3/p;

    new-instance v0, Leh/e;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Leh/e;-><init>(JLbc3/z;Lne3/p;Lne3/e0;)V

    iput-object v0, p0, Leh/h;->b:Leh/e;

    return-void
.end method
