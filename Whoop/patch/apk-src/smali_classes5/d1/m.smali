.class public final synthetic Ld1/m;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Ld1/m;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ld1/m;

    const-string v4, "<init>(Landroid/view/View;)V"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Ld1/j;

    const-string v3, "<init>"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Ld1/m;->w:Ld1/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Landroid/view/View;

    new-instance v0, Ld1/j;

    invoke-direct {v0, p1}, Ld1/j;-><init>(Landroid/view/View;)V

    return-object v0
.end method
