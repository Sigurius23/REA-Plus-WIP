.class public final Li3/c;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/j2;


# instance fields
.field public O:Z

.field public final P:Z

.field public Q:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;ZZ)V
    .locals 0

    invoke-direct {p0}, Lb2/v;-><init>()V

    iput-boolean p2, p0, Li3/c;->O:Z

    iput-boolean p3, p0, Li3/c;->P:Z

    iput-object p1, p0, Li3/c;->Q:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final H0()Z
    .locals 1

    iget-boolean v0, p0, Li3/c;->O:Z

    return v0
.end method

.method public final n(Li3/z;)V
    .locals 1

    iget-object v0, p0, Li3/c;->Q:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, Li3/c;->P:Z

    return v0
.end method
