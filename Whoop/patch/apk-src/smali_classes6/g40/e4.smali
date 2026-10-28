.class public final synthetic Lg40/e4;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lg40/e4;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lg40/e4;

    const-string v4, "defaultAutofillEventReporter()Lkotlin/jvm/functions/Function1;"

    const/4 v5, 0x1

    const/4 v1, 0x0

    const-class v2, Lg40/j4;

    const-string v3, "defaultAutofillEventReporter"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lg40/e4;->w:Lg40/e4;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lg40/j4;->a:Lp1/u2;

    new-instance v0, Lg40/y1;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lg40/y1;-><init>(I)V

    return-object v0
.end method
