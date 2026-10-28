.class public final Lo9/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:[I

.field public final c:[Ll9/g1;

.field public final d:[I

.field public final e:[[[I

.field public final f:Ll9/g1;


# direct methods
.method public constructor <init>([I[Ll9/g1;[I[[[ILl9/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/u;->b:[I

    iput-object p2, p0, Lo9/u;->c:[Ll9/g1;

    iput-object p4, p0, Lo9/u;->e:[[[I

    iput-object p3, p0, Lo9/u;->d:[I

    iput-object p5, p0, Lo9/u;->f:Ll9/g1;

    array-length p1, p1

    iput p1, p0, Lo9/u;->a:I

    return-void
.end method
