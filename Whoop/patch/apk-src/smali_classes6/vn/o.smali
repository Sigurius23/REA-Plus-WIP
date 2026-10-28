.class public final Lvn/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm/s;


# static fields
.field public static final f:Lrm/c0;

.field public static final g:Lrm/c0;


# instance fields
.field public final a:Lwm/s;

.field public final b:Lrm/c0;

.field public c:Lrm/c0;

.field public d:[B

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrm/b0;

    invoke-direct {v0}, Lrm/b0;-><init>()V

    const-string v1, "application/id3"

    iput-object v1, v0, Lrm/b0;->k:Ljava/lang/String;

    new-instance v1, Lrm/c0;

    invoke-direct {v1, v0}, Lrm/c0;-><init>(Lrm/b0;)V

    sput-object v1, Lvn/o;->f:Lrm/c0;

    new-instance v0, Lrm/b0;

    invoke-direct {v0}, Lrm/b0;-><init>()V

    const-string v1, "application/x-emsg"

    iput-object v1, v0, Lrm/b0;->k:Ljava/lang/String;

    new-instance v1, Lrm/c0;

    invoke-direct {v1, v0}, Lrm/c0;-><init>(Lrm/b0;)V

    sput-object v1, Lvn/o;->g:Lrm/c0;

    return-void
.end method

.method public constructor <init>(Lwm/s;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn/o;->a:Lwm/s;

    const/4 p1, 0x1

    if-eq p2, p1, :cond_1

    const/4 p1, 0x3

    if-ne p2, p1, :cond_0

    sget-object p1, Lvn/o;->g:Lrm/c0;

    iput-object p1, p0, Lvn/o;->b:Lrm/c0;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/16 v0, 0x21

    const-string v1, "Unknown metadataType: "

    invoke-static {v0, p2, v1}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object p1, Lvn/o;->f:Lrm/c0;

    iput-object p1, p0, Lvn/o;->b:Lrm/c0;

    :goto_0
    const/4 p1, 0x0

    new-array p2, p1, [B

    iput-object p2, p0, Lvn/o;->d:[B

    iput p1, p0, Lvn/o;->e:I

    return-void
.end method


# virtual methods
.method public final a(Lrm/c0;)V
    .locals 1

    iput-object p1, p0, Lvn/o;->c:Lrm/c0;

    iget-object p1, p0, Lvn/o;->a:Lwm/s;

    iget-object v0, p0, Lvn/o;->b:Lrm/c0;

    invoke-interface {p1, v0}, Lwm/s;->a(Lrm/c0;)V

    return-void
.end method

.method public final b(Lko/i;IZ)I
    .locals 3

    iget v0, p0, Lvn/o;->e:I

    add-int/2addr v0, p2

    iget-object v1, p0, Lvn/o;->d:[B

    array-length v2, v1

    if-ge v2, v0, :cond_0

    div-int/lit8 v2, v0, 0x2

    add-int/2addr v2, v0

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lvn/o;->d:[B

    :cond_0
    iget-object v0, p0, Lvn/o;->d:[B

    iget v1, p0, Lvn/o;->e:I

    invoke-interface {p1, v0, v1, p2}, Lko/i;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    if-eqz p3, :cond_1

    return p2

    :cond_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_2
    iget p2, p0, Lvn/o;->e:I

    add-int/2addr p2, p1

    iput p2, p0, Lvn/o;->e:I

    return p1
.end method

.method public final c(ILed3/a;)V
    .locals 3

    iget v0, p0, Lvn/o;->e:I

    add-int/2addr v0, p1

    iget-object v1, p0, Lvn/o;->d:[B

    array-length v2, v1

    if-ge v2, v0, :cond_0

    div-int/lit8 v2, v0, 0x2

    add-int/2addr v2, v0

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lvn/o;->d:[B

    :cond_0
    iget-object v0, p0, Lvn/o;->d:[B

    iget v1, p0, Lvn/o;->e:I

    invoke-virtual {p2, v0, v1, p1}, Led3/a;->g([BII)V

    iget p2, p0, Lvn/o;->e:I

    add-int/2addr p2, p1

    iput p2, p0, Lvn/o;->e:I

    return-void
.end method

.method public final d(JIIILwm/r;)V
    .locals 9

    iget-object v0, p0, Lvn/o;->c:Lrm/c0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lvn/o;->e:I

    sub-int/2addr v0, p5

    sub-int p4, v0, p4

    iget-object v1, p0, Lvn/o;->d:[B

    invoke-static {v1, p4, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p4

    new-instance v1, Led3/a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p4, v2, v3}, Led3/a;-><init>([BIB)V

    iget-object p4, p0, Lvn/o;->d:[B

    const/4 v2, 0x0

    invoke-static {p4, v0, p4, v2, p5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p5, p0, Lvn/o;->e:I

    iget-object p4, p0, Lvn/o;->c:Lrm/c0;

    iget-object p4, p4, Lrm/c0;->L:Ljava/lang/String;

    iget-object v0, p0, Lvn/o;->b:Lrm/c0;

    iget-object v2, v0, Lrm/c0;->L:Ljava/lang/String;

    iget-object v0, v0, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {p4, v2}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    iget-object p4, p0, Lvn/o;->c:Lrm/c0;

    iget-object p4, p4, Lrm/c0;->L:Ljava/lang/String;

    const-string v2, "application/x-emsg"

    invoke-virtual {v2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    const-string v2, "HlsSampleStreamWrapper"

    if-eqz p4, :cond_2

    invoke-static {v1}, Ljn/b;->f0(Led3/a;)Lkn/a;

    move-result-object p4

    invoke-virtual {p4}, Lkn/a;->d()Lrm/c0;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v1, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v0, v1}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Led3/a;

    invoke-virtual {p4}, Lkn/a;->j()[B

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-direct {v1, p4, v0, v2}, Led3/a;-><init>([BIB)V

    :goto_0
    invoke-virtual {v1}, Led3/a;->a()I

    move-result v6

    iget-object v2, p0, Lvn/o;->a:Lwm/s;

    invoke-interface {v2, v6, v1}, Lwm/s;->c(ILed3/a;)V

    move-wide v3, p1

    move v5, p3

    move v7, p5

    move-object v8, p6

    invoke-interface/range {v2 .. v8}, Lwm/s;->d(JIIILwm/r;)V

    return-void

    :cond_1
    invoke-virtual {p4}, Lkn/a;->d()Lrm/c0;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Ignoring EMSG. Expected it to contain wrapped "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " but actual wrapped format: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    iget-object p1, p0, Lvn/o;->c:Lrm/c0;

    iget-object p1, p1, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const-string p3, "Ignoring sample for unsupported format: "

    if-eqz p2, :cond_3

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-static {v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
