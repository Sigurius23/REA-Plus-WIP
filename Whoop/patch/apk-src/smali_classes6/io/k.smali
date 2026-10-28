.class public abstract Lio/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final w:I

.field public final x:Lsn/w0;

.field public final y:I

.field public final z:Lrm/c0;


# direct methods
.method public constructor <init>(ILsn/w0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/k;->w:I

    iput-object p2, p0, Lio/k;->x:Lsn/w0;

    iput p3, p0, Lio/k;->y:I

    iget-object p1, p2, Lsn/w0;->y:[Lrm/c0;

    aget-object p1, p1, p3

    iput-object p1, p0, Lio/k;->z:Lrm/c0;

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b(Lio/k;)Z
.end method
