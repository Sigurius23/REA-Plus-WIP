.class public final Li3/o;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/j2;


# instance fields
.field public final synthetic O:Lkotlin/jvm/internal/m;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Li3/o;->O:Lkotlin/jvm/internal/m;

    invoke-direct {p0}, Lb2/v;-><init>()V

    return-void
.end method


# virtual methods
.method public final n(Li3/z;)V
    .locals 1

    iget-object v0, p0, Li3/o;->O:Lkotlin/jvm/internal/m;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
