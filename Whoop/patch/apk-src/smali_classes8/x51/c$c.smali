.class public final Lx51/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx51/c;->g(Landroidx/compose/ui/Modifier;Lx51/d;Ld0/z1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Ld0/z1;


# direct methods
.method public constructor <init>(Ld0/z1;)V
    .locals 0

    iput-object p1, p0, Lx51/c$c;->w:Ld0/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ld0/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld0/t1;"
        }
    .end annotation

    iget-object v0, p0, Lx51/c$c;->w:Ld0/z1;

    invoke-virtual {v0}, Ld0/z1;->f()Ld0/t1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx51/c$c;->a()Ld0/t1;

    move-result-object v0

    return-object v0
.end method
