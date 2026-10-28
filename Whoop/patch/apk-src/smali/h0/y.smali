.class public final Lh0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/g1;


# instance fields
.field public final synthetic a:Lh0/z;


# direct methods
.method public constructor <init>(Lh0/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/y;->a:Lh0/z;

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 1

    iget-object v0, p0, Lh0/y;->a:Lh0/z;

    iget-object v0, v0, Lh0/z;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
