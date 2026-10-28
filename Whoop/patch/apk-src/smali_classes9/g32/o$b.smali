.class final Lg32/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh20/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg32/o;->f(Lg32/f;Lg32/e;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lc93/a;
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


# instance fields
.field final synthetic w:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field

.field final synthetic x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lg32/o$b;->w:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lg32/o$b;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly00/o4;ZLq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly00/o4;",
            "Z",
            "Lq83/d<",
            "-",
            "Lh20/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lg32/o$b;->w:Lkotlin/jvm/functions/Function3;

    iget-object v0, p0, Lg32/o$b;->x:Ljava/lang/String;

    invoke-interface {p2, p1, v0, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
