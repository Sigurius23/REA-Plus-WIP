.class public final Llf0/z1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llf0/z1;->s(Landroidx/compose/ui/Modifier;Llf0/a2;Lde0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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


# static fields
.field public static final w:Llf0/z1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llf0/z1$b;

    invoke-direct {v0}, Llf0/z1$b;-><init>()V

    sput-object v0, Llf0/z1$b;->w:Llf0/z1$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Void;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llf0/e;",
            ")",
            "Ljava/lang/Void;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Llf0/z1$b;->a(Ljava/lang/Object;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
