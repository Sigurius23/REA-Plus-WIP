.class public final Lp0/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:La3/p;

.field public c:Lb9/b;

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La3/p;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, La3/p;-><init>(I)V

    iput-object v0, p0, Lp0/l0;->b:La3/p;

    const/4 v0, -0x1

    iput v0, p0, Lp0/l0;->d:I

    iput v0, p0, Lp0/l0;->e:I

    iput-object p1, p0, Lp0/l0;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method
