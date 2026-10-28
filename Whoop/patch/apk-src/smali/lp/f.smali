.class public final Llp/f;
.super Llp/e;
.source "SourceFile"


# static fields
.field public static final E:Llp/f;


# instance fields
.field public final transient y:[Ljava/lang/Object;

.field public final transient z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llp/f;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v1, v2}, Llp/f;-><init>(I[Ljava/lang/Object;)V

    sput-object v0, Llp/f;->E:Llp/f;

    return-void
.end method

.method public constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p2, p0, Llp/f;->y:[Ljava/lang/Object;

    iput p1, p0, Llp/f;->z:I

    return-void
.end method


# virtual methods
.method public final a()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llp/f;->y:[Ljava/lang/Object;

    return-object v0
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Llp/f;->z:I

    return v0
.end method

.method public final e([Ljava/lang/Object;)I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Llp/f;->y:[Ljava/lang/Object;

    iget v2, p0, Llp/f;->z:I

    invoke-static {v1, v0, p1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v2
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llp/f;->z:I

    invoke-static {p1, v0}, Ljc/x;->C0(II)V

    iget-object v0, p0, Llp/f;->y:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Llp/f;->z:I

    return v0
.end method
