.class public final synthetic Lx03/a;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lx03/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lx03/a;

    const-string v4, "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lx03/c;

    const-string v3, "<init>"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lx03/a;->w:Lx03/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ln0/g;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lx03/c;

    invoke-direct {v0, p1}, Lx03/c;-><init>(Ln0/g;)V

    return-object v0
.end method
