.class public final synthetic Lo42/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Ln42/b;


# direct methods
.method public synthetic constructor <init>(Ln42/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo42/i;->w:Ln42/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    iget-object v0, p0, Lo42/i;->w:Ln42/b;

    invoke-static {v0, p1, p2, p3, p4}, Lo42/k;->w(Ln42/b;Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
