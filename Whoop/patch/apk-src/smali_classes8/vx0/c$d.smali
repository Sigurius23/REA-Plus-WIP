.class final Lvx0/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvx0/c;->w(Lvx0/e;Lc93/a;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic w:Lvx0/e;

.field final synthetic x:Lmj0/e;


# direct methods
.method public constructor <init>(Lvx0/e;Lmj0/e;)V
    .locals 0

    iput-object p1, p0, Lvx0/c$d;->w:Lvx0/e;

    iput-object p2, p0, Lvx0/c$d;->x:Lmj0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lvx0/c$d;->w:Lvx0/e;

    iget-object v1, p0, Lvx0/c$d;->x:Lmj0/e;

    invoke-virtual {v0, v1}, Lvx0/e;->n(Lmj0/e;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvx0/c$d;->a()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
