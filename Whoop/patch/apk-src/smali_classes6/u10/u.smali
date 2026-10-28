.class public final Lu10/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lk20/a;

.field public final b:Lz20/g;

.field public final c:Ls10/f;

.field public final d:Lh20/f;

.field public final e:Lk83/a;

.field public final f:Lv00/c0;

.field public final g:Lq83/j;

.field public final h:Lq83/j;

.field public final i:Lbc3/c0;

.field public final j:Lv03/b;


# direct methods
.method public constructor <init>(Lk20/a;Lz20/g;Ls10/f;Lh20/f;Lk83/a;Lv00/c0;Lq83/j;Lq83/j;Lbc3/c0;Lv03/b;)V
    .locals 1

    const-string v0, "eventReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerStateHolder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manageNavigatorProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelScope"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu10/u;->a:Lk20/a;

    iput-object p2, p0, Lu10/u;->b:Lz20/g;

    iput-object p3, p0, Lu10/u;->c:Ls10/f;

    iput-object p4, p0, Lu10/u;->d:Lh20/f;

    iput-object p5, p0, Lu10/u;->e:Lk83/a;

    iput-object p6, p0, Lu10/u;->f:Lv00/c0;

    iput-object p7, p0, Lu10/u;->g:Lq83/j;

    iput-object p8, p0, Lu10/u;->h:Lq83/j;

    iput-object p9, p0, Lu10/u;->i:Lbc3/c0;

    iput-object p10, p0, Lu10/u;->j:Lv03/b;

    return-void
.end method
