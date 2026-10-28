.class public final Lp0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/e;


# instance fields
.field public final synthetic a:Lp0/n;

.field public final synthetic b:Lkotlin/jvm/internal/g0;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lp0/n;Lkotlin/jvm/internal/g0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/m;->a:Lp0/n;

    iput-object p2, p0, Lp0/m;->b:Lkotlin/jvm/internal/g0;

    iput p3, p0, Lp0/m;->c:I

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    iget-object v0, p0, Lp0/m;->b:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lp0/k;

    iget v1, p0, Lp0/m;->c:I

    iget-object v2, p0, Lp0/m;->a:Lp0/n;

    invoke-virtual {v2, v0, v1}, Lp0/n;->X0(Lp0/k;I)Z

    move-result v0

    return v0
.end method
