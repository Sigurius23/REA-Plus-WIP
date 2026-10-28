.class final Lfc2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfc2/b;->g(Lec2/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/a;"
    }
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
.field final synthetic w:Lec2/a;

.field final synthetic x:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lec2/a;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec2/a;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lfc2/b$a;->w:Lec2/a;

    iput-object p2, p0, Lfc2/b$a;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lfc2/b$a;->x:Lp1/c1;

    iget-object v1, p0, Lfc2/b$a;->w:Lec2/a;

    invoke-virtual {v1}, Lec2/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lfc2/b;->q(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lfc2/b$a;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
