.class public final Lio/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:[I

.field public final c:[Lsn/x0;

.field public final d:[[[I


# direct methods
.method public constructor <init>([I[Lsn/x0;[[[ILsn/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/q;->b:[I

    iput-object p2, p0, Lio/q;->c:[Lsn/x0;

    iput-object p3, p0, Lio/q;->d:[[[I

    array-length p1, p1

    iput p1, p0, Lio/q;->a:I

    return-void
.end method
