.class public final La3/i2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/io/Serializable;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    new-array v1, v0, [Ly2/o;

    iput-object v1, p0, La3/i2;->b:Ljava/lang/Object;

    new-array v1, v0, [F

    iput-object v1, p0, La3/i2;->c:Ljava/lang/Object;

    new-array v0, v0, [B

    iput-object v0, p0, La3/i2;->d:Ljava/io/Serializable;

    sget-object v0, La0/e1;->a:La0/w0;

    new-instance v0, La0/w0;

    invoke-direct {v0}, La0/w0;-><init>()V

    iput-object v0, p0, La3/i2;->e:Ljava/lang/Object;

    new-instance v0, La0/w0;

    invoke-direct {v0}, La0/w0;-><init>()V

    iput-object v0, p0, La3/i2;->f:Ljava/lang/Object;

    return-void
.end method
