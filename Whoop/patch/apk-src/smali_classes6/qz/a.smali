.class public final Lqz/a;
.super Lad3/e0;
.source "SourceFile"


# static fields
.field public static final b:Lqz/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqz/a;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lad3/e0;-><init>(Lkotlinx/serialization/internal/StringSerializer;)V

    sput-object v0, Lqz/a;->b:Lqz/a;

    return-void
.end method
