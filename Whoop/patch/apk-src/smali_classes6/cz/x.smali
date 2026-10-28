.class public final Lcz/x;
.super Lcz/b0;
.source "SourceFile"


# instance fields
.field public final a:Lh20/l;


# direct methods
.method public constructor <init>(Lh20/l;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz/x;->a:Lh20/l;

    return-void
.end method
