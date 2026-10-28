.class final Ljf0/c$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljf0/c;->a(Landroid/content/Context;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.util.TextFileDownloadHelper"
    f = "TextFileDownloadHelper.kt"
    l = {
        0x1b,
        0x20
    }
    m = "downloadAndSaveToUri"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Ljf0/c;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljf0/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljf0/c;",
            "Lq83/d<",
            "-",
            "Ljf0/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljf0/c$a;->G:Ljf0/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ljf0/c$a;->F:Ljava/lang/Object;

    iget p1, p0, Ljf0/c$a;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ljf0/c$a;->H:I

    iget-object p1, p0, Ljf0/c$a;->G:Ljf0/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Ljf0/c;->a(Landroid/content/Context;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
