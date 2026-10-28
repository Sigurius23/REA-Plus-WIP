.class public final Lzz/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb00/a;

.field public final b:Lt40/f;

.field public final c:Lxz/x;

.field public final d:Lwz/g0;

.field public final e:Lb20/f;

.field public final f:Lq83/j;


# direct methods
.method public constructor <init>(Lb00/a;Lt40/f;Lxz/x;Lwz/g0;Lb20/f;Lq83/j;)V
    .locals 1

    const-string v0, "linkGate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrityRequestManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfiguration"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzz/a;->a:Lb00/a;

    iput-object p2, p0, Lzz/a;->b:Lt40/f;

    iput-object p3, p0, Lzz/a;->c:Lxz/x;

    iput-object p4, p0, Lzz/a;->d:Lwz/g0;

    iput-object p5, p0, Lzz/a;->e:Lb20/f;

    iput-object p6, p0, Lzz/a;->f:Lq83/j;

    return-void
.end method
