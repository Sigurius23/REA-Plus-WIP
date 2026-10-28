.class public final Landroidx/compose/foundation/layout/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll0/u;


# static fields
.field public static final a:Landroidx/compose/foundation/layout/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/layout/BoxChildDataElement;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Landroidx/compose/foundation/layout/BoxChildDataElement;-><init>(Lb2/h;Z)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    new-instance v0, Landroidx/compose/foundation/layout/BoxChildDataElement;

    sget-object v1, Lb2/e;->E:Lb2/m;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/layout/BoxChildDataElement;-><init>(Lb2/h;Z)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
