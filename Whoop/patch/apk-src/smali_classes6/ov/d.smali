.class public final synthetic Lov/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lov/o;


# direct methods
.method public synthetic constructor <init>(Lov/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lov/d;->a:Lov/o;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/mapbox/maps/EdgeInsets;

    const-string v0, "this$0"

    iget-object v1, p0, Lov/d;->a:Lov/o;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, v1, Lov/o;->X:Z

    return-void
.end method
