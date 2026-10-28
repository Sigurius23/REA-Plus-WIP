.class public abstract Lo9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final w:I

.field public final x:Lu8/p0;

.field public final y:I

.field public final z:Lu8/p;


# direct methods
.method public constructor <init>(ILu8/p0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lo9/o;->w:I

    iput-object p2, p0, Lo9/o;->x:Lu8/p0;

    iput p3, p0, Lo9/o;->y:I

    iget-object p1, p2, Lu8/p0;->d:[Lu8/p;

    aget-object p1, p1, p3

    iput-object p1, p0, Lo9/o;->z:Lu8/p;

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b(Lo9/o;)Z
.end method
