.class public Lod1/t$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lod1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private final a:Lod1/t$h;

.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lod1/t$h;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod1/t$e;->a:Lod1/t$h;

    iput-object p2, p0, Lod1/t$e;->b:Ljava/lang/Object;

    return-void
.end method

.method public static bridge synthetic a(Lod1/t$e;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lod1/t$e;->b:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic b(Lod1/t$e;)Lod1/t$h;
    .locals 0

    iget-object p0, p0, Lod1/t$e;->a:Lod1/t$h;

    return-object p0
.end method
