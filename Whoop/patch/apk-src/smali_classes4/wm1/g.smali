.class public final synthetic Lwm1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lwm1/g;->w:F

    iput-object p2, p0, Lwm1/g;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/v;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget v0, p0, Lwm1/g;->w:F

    iget-object v1, p0, Lwm1/g;->x:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2, p3}, Lwm1/k;->e(FLjava/lang/String;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
