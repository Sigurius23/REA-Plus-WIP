.class public final Lhb/j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lhb/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhb/j;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lhb/j;->w:Lhb/j;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ll83/k;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
