.class public final Ld0/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:La0/g0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x12c

    iput v0, p0, Ld0/o0;->a:I

    sget-object v0, La0/t;->a:La0/g0;

    new-instance v0, La0/g0;

    invoke-direct {v0}, La0/g0;-><init>()V

    iput-object v0, p0, Ld0/o0;->b:La0/g0;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Float;)Ld0/n0;
    .locals 2

    new-instance v0, Ld0/n0;

    sget-object v1, Ld0/b0;->c:Lb23/h;

    invoke-direct {v0, p2, v1}, Ld0/n0;-><init>(Ljava/lang/Float;Ld0/z;)V

    iget-object p2, p0, Ld0/o0;->b:La0/g0;

    invoke-virtual {p2, p1, v0}, La0/g0;->h(ILjava/lang/Object;)V

    return-object v0
.end method
